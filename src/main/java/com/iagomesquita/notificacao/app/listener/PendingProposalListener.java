package com.iagomesquita.notificacao.app.listener;

import com.iagomesquita.notificacao.app.constant.MessagesContant;
import com.iagomesquita.notificacao.app.domain.Proposal;
import com.iagomesquita.notificacao.app.service.NotificationSNSService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class PendingProposalListener {

  private NotificationSNSService notificationSNSService;

  public PendingProposalListener(NotificationSNSService notificationSNSService) {
    this.notificationSNSService = notificationSNSService;
  }

  @RabbitListener(queues = "${rabbitmq.queue.pending-proposal.ms-notification}")
  public void pendingProprosal(Proposal proposal) {
    String message = String.format(
        MessagesContant.PROPOSAL_UNDER_ANALISYS, proposal.getUsuario().getNome());
    String phoneNumber = proposal.getUsuario().getTelefone();

    notificationSNSService.notifyPendingProposal(phoneNumber, message);
  }



}

//Por estarmos inscritos em uma fila, quando algo chegar nessa fila o @RabbitListener estara
// ouvindo/observando conforme as filas que definimos para ele.