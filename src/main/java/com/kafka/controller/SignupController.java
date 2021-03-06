package com.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.model.User;
import com.kafka.publisher.UserKafkaPublisher;

@RestController
public class SignupController {

	private static final String SIGNUP_TOPIC = "signup.topic";
	
	@Autowired
	private UserKafkaPublisher userKafkaPublisher;
	
	
	@RequestMapping(value = "/signup", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public User signup(@RequestBody User user){
		userKafkaPublisher.sendMessage(SIGNUP_TOPIC, user);
		return user;
	}
	
}
