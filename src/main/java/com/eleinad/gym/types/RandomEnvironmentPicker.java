package com.eleinad.gym.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RandomEnvironmentPicker {

    private static final List<Environment> VALUES =
            Collections.unmodifiableList(Arrays.asList(Environment.values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static Environment randomEnvironment() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }

    public static String getRandomProfile() {
        Environment environment = randomEnvironment();
        System.out.println(environment.getDesc());
        return environment.getDesc();
    }

}
