package yago.ferreira.votemq.infra.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

    public static final String VOTO_EXCHANGE = "computar-voto.ex";
    public static final String VOTO_QUEUE = "voto.queue";

    @Bean
    public Queue queue() {
        return new Queue(VOTO_QUEUE);
    }

    @Bean
    public TopicExchange exchange() {
        return new TopicExchange(VOTO_EXCHANGE);
    }

    @Bean
    public RabbitAdmin rabbitAdmin(ConnectionFactory connectionFactory) {
        return new RabbitAdmin(connectionFactory);
    }

    @Bean
    public ApplicationListener<ApplicationReadyEvent> listener(RabbitAdmin rabbitAdmin) {
        return event -> rabbitAdmin.initialize();
    }

}
