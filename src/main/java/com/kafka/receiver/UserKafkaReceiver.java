package com.kafka.receiver;

import java.util.concurrent.CountDownLatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

import com.kafka.model.User;

public class UserKafkaReceiver {

	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserKafkaReceiver.class);
	private static final String SIGNUP_TOPIC = "signup.topic";
	
	private CountDownLatch latch = new CountDownLatch(1);

	@KafkaListener(topics = SIGNUP_TOPIC)
	public void receiveSignupDetails(User user) {
		LOGGER.info("received Sign-up Details='{}'", user.toString());
		latch.countDown();
	}

	public CountDownLatch getLatch() {
		return latch;
	}
}
