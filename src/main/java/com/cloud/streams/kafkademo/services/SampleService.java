package com.cloud.streams.kafkademo.services;

import com.cloud.streams.kafkademo.Message;
import com.cloud.streams.kafkademo.Streams;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

@Service
@Slf4j
public class SampleService {

    private final Streams streams;

    public SampleService(Streams streams) {
        this.streams = streams;
    }

    public void sendGreeting(final Message message) {
        log.info("Sending message {}", message);
        MessageChannel messageChannel = streams.outboundTest();
        messageChannel.send(MessageBuilder
                .withPayload(message)
                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
                .build());
    }
}
