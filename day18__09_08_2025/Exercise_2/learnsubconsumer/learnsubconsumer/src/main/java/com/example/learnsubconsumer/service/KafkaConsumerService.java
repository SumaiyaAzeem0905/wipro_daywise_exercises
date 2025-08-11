package com.example.learnsubconsumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerService {
	@KafkaListener(topics = "learn-subjects", groupId = "learn-subject-group")
    public void listen(String message) {
        System.out.println("Consumed message: " + message);
        // also do any business logic here
    }
	@KafkaListener(topics = "learn-subjects", groupId = "subject-group",
            containerFactory = "subjectKafkaListenerContainerFactory")
public void consume(Subject subject) {
 System.out.println("Received Subject: " + subject);
}
}
