package com.example.kafka.service;
import java.util.Date;
import java.util.Map;;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer implements IConsumer{

    @KafkaListener(topics="first_topic",groupId = "group_id")
    @Override
    public void consume(String message) {
        System.out.println("consumed "+message);
    }
}
