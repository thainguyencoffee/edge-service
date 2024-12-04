package com.firstapp.edgeservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class GreetingController {

    private final EdgeServiceProperties edgeServiceProperties;

    public GreetingController(EdgeServiceProperties edgeServiceProperties) {
        this.edgeServiceProperties = edgeServiceProperties;
    }

    @GetMapping("/greeting")
    public Mono<String> greeting() {
        return Mono.just(edgeServiceProperties.greeting());
    }
}
