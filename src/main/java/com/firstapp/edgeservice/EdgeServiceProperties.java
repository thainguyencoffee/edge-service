package com.firstapp.edgeservice;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "edge-service")
public record EdgeServiceProperties(
        String greeting
) {
}
