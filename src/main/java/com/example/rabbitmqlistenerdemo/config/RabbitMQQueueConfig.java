package com.example.rabbitmqlistenerdemo.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQQueueConfig {

    @Bean
    Queue exampleQueue(){
        return new Queue("ExampleQueue", true);
    }

    @Bean
    Queue exampleQueue2(){
        return QueueBuilder
                .durable("ExampleQueue2")
                .autoDelete()
                .exclusive()
                .build();
    }

}
