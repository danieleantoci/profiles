package com.eleinad.gym.types;

import lombok.Getter;

@Getter
public enum Environment {

    DEV("dev"),
    TEST("test"),
    PROD("prod"),
    DEFAULT("default");

    private final String desc;

    Environment(String desc) {
        this.desc = desc;
    }
}
