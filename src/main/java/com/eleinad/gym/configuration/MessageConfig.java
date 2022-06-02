package com.eleinad.gym.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@ConfigurationProperties(prefix = "app.props")
@Configuration
@Setter
@Getter
public class MessageConfig {

    private String message;

    @Bean
    @Profile("dev")
    public String devMessage() {
        System.out.println("DEV: " + message);
        return null;
    }

    @Bean
    @Profile("!dev")
    public String genericMessage() {
        System.out.println(message);
        return null;
    }

}
