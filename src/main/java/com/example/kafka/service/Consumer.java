package com.example.kafka.service;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer implements IConsumer{

    @KafkaListener(topics="first_topic",groupId = "group_id")
    @Override
    public void consume(String message) {
        System.out.println("consumed "+message);
    }
    
    public void abc()
    {
        System.out.println("");
    }
    
    public void bc()
    {
        System.out.println("");
    }
   
}
