package com.example.kafka.service;

import org.springframework.stereotype.Service;

public interface IProducer {
    public void sendMessage(String message);

}
