package com.cloud.streams.kafkademo;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface Streams {
    String INPUT = "cts-test-in";
    String OUTPUT = "cts-test-out";

    @Input(INPUT)
    SubscribableChannel inboundTest();
    @Output(OUTPUT)
    MessageChannel outboundTest();
}
