package com.example.SpringularReddit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringularRedditApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringularRedditApplication.class, args);
	}

}
