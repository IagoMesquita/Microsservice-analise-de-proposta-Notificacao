package com.iagomesquita.notificacao.app.config;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Diferente do professor nao tive erro do tipo MessageConversionExcepetion, mas mesmo assim
// criei esse metodo que resolveria esse problema, para deixar documentado.
// Da fila vem um JSON ma no Listener estamos recebendo uma Entidade Proposal

@Configuration
public class RabbitMQConfiguration {

  @Bean
  public MessageConverter messageConverter() {
    return new Jackson2JsonMessageConverter();
  }


}
