package com.harrisonbrock.citiesapp;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CitiesappApplication {

    static final String EXCHANGE_NAME = "LambdaSchool";
    static final String QUEUE_CITY1 = "";
    static final String QUEUE_CITY2 = "";
    static final String QUEUE_SECRET = "";
    public static void main(String[] args) {
        SpringApplication.run(CitiesappApplication.class, args);
    }

    @Bean
    public TopicExchange appExchange() {
        return new TopicExchange(EXCHANGE_NAME);
    }

    @Bean
    public Queue appQueueSecret() {
        return new Queue(QUEUE_SECRET);
    }

    @Bean
    public Queue appQueueCity1() {
        return new Queue(QUEUE_CITY1);
    }

    @Bean
    public Queue appQueueCity2() {
        return new Queue(QUEUE_CITY2);
    }

    @Bean
    public Binding declareBingSecret() {
        return BindingBuilder.bind(appQueueSecret()).to(appExchange()).with(QUEUE_SECRET);
    }

    @Bean
    public Binding declareBingCity1() {
        return BindingBuilder.bind(appQueueCity1()).to(appExchange()).with(QUEUE_CITY1);
    }

    @Bean
    public Binding declareBingCity2() {
        return BindingBuilder.bind(appQueueCity2()).to(appExchange()).with(QUEUE_CITY2);
    }

}

