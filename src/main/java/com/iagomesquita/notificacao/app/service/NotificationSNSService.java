package com.iagomesquita.notificacao.app.service;

import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.model.PublishRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationSNSService {

  @Autowired
  private AmazonSNS amazonSNS;

  public void notifyPendingProposal(String phoneNumber, String message) {
    PublishRequest publishRequest = new PublishRequest().withMessage(message).withPhoneNumber(phoneNumber);
    amazonSNS.publish(publishRequest);
  }
}
