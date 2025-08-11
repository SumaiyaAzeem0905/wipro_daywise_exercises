package com.example.uberservice.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import com.example.uberservice.entity.UberBooking;

@EnableKafka
@Configuration
public class KafkaConfig {
	@Bean
    public ConsumerFactory<String, UberBooking> bookingConsumerFactory() {
        JsonDeserializer<UberBooking> deserializer = new JsonDeserializer<>(UberBooking.class);
        deserializer.setRemoveTypeHeaders(false);
        deserializer.addTrustedPackages("*");
        deserializer.setUseTypeMapperForKey(true);

        Map<String, Object> props = new HashMap<>();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(ConsumerConfig.GROUP_ID_CONFIG, "uber_group");
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, deserializer);

        return new DefaultKafkaConsumerFactory<>(props, new StringDeserializer(), deserializer);
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, UberBooking> bookingKafkaListenerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, UberBooking> factory =
                new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(bookingConsumerFactory());
        return factory;
    }
}
