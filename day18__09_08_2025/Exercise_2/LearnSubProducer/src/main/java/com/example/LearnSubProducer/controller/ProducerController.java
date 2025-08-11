package com.example.LearnSubProducer.controller;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import com.example.LearnSubProducer.model.Subject;
import com.example.LearnSubProducer.service.KafkaProducerService;

@RestController
@RequestMapping("/api")
public class ProducerController {
	private final KafkaTemplate<String, String> kafkaTemplate;
    private static final String TOPIC = "learn-subjects";

    public ProducerController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    @Autowired
    private KafkaTemplate<String, Subject> kafkaTemplate1;

    @PostMapping("/publish")
    public String sendMessage(@RequestBody Map<String, String> message) {
        kafkaTemplate.send("learn-subjects", message.get("key"), message.get("value"));
        return "Message sent to Kafka topic successfully";
    }
    @PostMapping("/send")
    public String sendMessage(@RequestBody Subject subject) {
        kafkaTemplate.send(TOPIC, subject.getSubjectCode());
        return "Subject sent to Kafka topic successfully";
    }
}
