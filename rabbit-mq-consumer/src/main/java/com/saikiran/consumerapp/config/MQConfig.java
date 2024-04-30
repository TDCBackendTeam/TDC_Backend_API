package com.saikiran.consumerapp.config;

import org.springframework.amqp.core.*;

import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;

@Configuration
public class MQConfig {

    public final static String STUDENTQUEUE = "student_queue";
    public final static String EMPLOYEEQUEUE = "employee_queue";
    public final static String employee_route_key = "employee_route_key";
    public final static String student_route_key = "student_route_key";
    public final static String TOPICEXCHANGE = "topic_exchange";

    @Bean
    public Queue employeeQueue() {
        return new Queue(EMPLOYEEQUEUE);
    }

    @Bean
    public Queue studentQueue() {
        return new Queue(STUDENTQUEUE);
    }

    @Bean
    public TopicExchange exchange() {
        return new TopicExchange(TOPICEXCHANGE);
    }

    @Bean
    public Binding employeeBinding() {
        return BindingBuilder.bind(employeeQueue()).to(exchange()).with(employee_route_key);
    }

    @Bean
    public Binding studentBinding() {
        return BindingBuilder.bind(studentQueue()).to(exchange()).with(student_route_key);
    }

    @Bean
    public MessageConverter messageConverter() {
        return new Jackson2JsonMessageConverter();
    }

    @Bean
    public AmqpTemplate template(ConnectionFactory connectionFactory) {
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(messageConverter());
        return rabbitTemplate;
    }
}
