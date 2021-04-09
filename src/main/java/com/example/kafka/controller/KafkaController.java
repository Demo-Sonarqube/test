package com.example.kafka.controller;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;
import java.util.Vector;
import java.util.List;
import java.util.ArrayList;
import java.util.Deque;

import com.example.kafka.service.IProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

    @Autowired
    private IProducer producer;

    @PostMapping("/publish")
    public void sendMessage(@RequestParam("message") String message){
        this.producer.sendMessage(message);
    }
}
