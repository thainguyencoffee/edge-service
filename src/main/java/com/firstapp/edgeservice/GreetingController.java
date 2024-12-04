package com.firstapp.edgeservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class GreetingController {

    private final EdgeProperties edgeProperties;

    public GreetingController(EdgeProperties edgeProperties) {
        this.edgeProperties = edgeProperties;
    }

    @GetMapping("/greeting")
    public Mono<String> greeting() {
        return Mono.just(edgeProperties.greeting());
    }
}
