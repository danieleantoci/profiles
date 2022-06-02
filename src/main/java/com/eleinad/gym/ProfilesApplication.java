package com.eleinad.gym;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import static com.eleinad.gym.types.RandomEnvironmentPicker.getRandomProfile;

@SpringBootApplication
public class ProfilesApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ProfilesApplication.class)
				.profiles(getRandomProfile())
				.run(args);
	}

}
