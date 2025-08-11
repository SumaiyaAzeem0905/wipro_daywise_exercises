package com.example.LearnSubProducer.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {
	 private final KafkaTemplate<String, String> kafkaTemplate;
	    private final String topic = "learn-subjects";

	    public KafkaProducerService(KafkaTemplate<String, String> kafkaTemplate) {
	        this.kafkaTemplate = kafkaTemplate;
	    }

	    public void send(String msg) {
	        kafkaTemplate.send(topic, msg);
	    }
}
