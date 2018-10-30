package com.cloud.streams.kafkademo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter @Setter @ToString @Builder
public class Message {
    private long timestamp;
    private String message;
}
