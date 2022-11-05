package com.springkafkaconsumer.service.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SchedulerReceive {

    private static final String ORDER_TOPIC = "t.scheduled";

    @KafkaListener(topics = ORDER_TOPIC)
    public void consumeMessage(String message) {
        log.info("receive a text {}", message);
    }

}
