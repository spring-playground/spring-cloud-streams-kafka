package com.cloud.streams.kafkademo.controllers;

import com.cloud.streams.kafkademo.Message;
import com.cloud.streams.kafkademo.services.SampleService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    private final SampleService streamsService;

    public SampleController(SampleService streamsService) {
        this.streamsService = streamsService;
    }

    @GetMapping("/greetings")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void greetings(@RequestParam("message") String message) {
        Message messageToReturn = Message.builder()
                .message(message)
                .timestamp(System.currentTimeMillis())
                .build();
        streamsService.sendGreeting(messageToReturn);
    }
}
