package com.cloud.streams.kafkademo.config;

import com.cloud.streams.kafkademo.Streams;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(Streams.class)
public class StreamsConfig {
}
