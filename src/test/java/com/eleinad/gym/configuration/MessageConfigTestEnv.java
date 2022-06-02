package com.eleinad.gym.configuration;

import org.junit.jupiter.api.Test;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ActiveProfiles("test")
public class MessageConfigTestEnv extends MessageConfigTest {

    @Override
    @Test
    void testMessage() {
        assertEquals("This is the TEST property message for Profiles Application", messageConfig.getMessage());
    }
}
