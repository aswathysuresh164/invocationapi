package com.invocation.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync  //To enable the asynchronous processing
public class InvocationapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvocationapiApplication.class, args);
	}

}
