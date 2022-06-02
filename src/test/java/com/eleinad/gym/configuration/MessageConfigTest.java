package com.eleinad.gym.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
abstract class MessageConfigTest {

    @Autowired
    MessageConfig messageConfig;

    abstract void testMessage();

}