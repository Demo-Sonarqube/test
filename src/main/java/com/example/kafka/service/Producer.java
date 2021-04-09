package com.example.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer implements IProducer{

    private static final String TOPIC="first_topic";

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;
    @Override
    public void sendMessage(String message) {
        this.kafkaTemplate.send(TOPIC,message);
    }
}
