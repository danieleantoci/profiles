package com.eleinad.gym.configuration;

import org.junit.jupiter.api.Test;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ActiveProfiles("default")
public class MessageConfigDefaultTest extends MessageConfigTest {

    @Override
    @Test
    void testMessage() {
        assertEquals("This is the primary property file for Profiles Application", messageConfig.getMessage());
    }
}
