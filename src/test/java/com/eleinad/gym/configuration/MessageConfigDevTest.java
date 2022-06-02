package com.eleinad.gym.configuration;

import org.junit.jupiter.api.Test;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ActiveProfiles("dev")
public class MessageConfigDevTest extends MessageConfigTest {

    @Override
    @Test
    void testMessage() {
        assertEquals("This is DEV env property file for Profiles Application", messageConfig.getMessage());
    }
}
