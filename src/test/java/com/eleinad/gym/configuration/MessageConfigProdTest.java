package com.eleinad.gym.configuration;

import org.junit.jupiter.api.Test;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ActiveProfiles("prod")
public class MessageConfigProdTest extends MessageConfigTest {

    @Override
    @Test
    void testMessage() {
        assertEquals("This is PROD env property file for Profiles Application", messageConfig.getMessage());
    }
}
