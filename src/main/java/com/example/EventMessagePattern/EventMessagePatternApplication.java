package com.example.EventMessagePattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EventMessagePatternApplication implements CommandLineRunner {

	@Autowired
	private RegistrationService registrationService;

	public static void main(String[] args) {
		SpringApplication.run(EventMessagePatternApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		registrationService.notifyObservers(new Event("EventId1", "EventType1"));
	}
}
