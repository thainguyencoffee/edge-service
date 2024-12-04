package com.firstapp.edgeservice;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "edge")
public record EdgeProperties(
        String greeting
) {
}
