package com.cloud.streams.kafkademo.listeners;

import com.cloud.streams.kafkademo.Message;
import com.cloud.streams.kafkademo.Streams;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@Slf4j
//@EnableBinding(KafkaStreamsProcessor.class)
public class SampleListener {
    @StreamListener(Streams.INPUT)
    public void handle(@Payload Message message) {
        log.info("Received message: {}", message);
    }
}
