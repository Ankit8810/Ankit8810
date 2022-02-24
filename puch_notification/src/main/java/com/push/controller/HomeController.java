package com.push.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.push.model.PushNotificationRequest;
import com.push.model.PushNotificationResponse;
import com.push.service.PushNotificationService;

@RestController
public class HomeController {
	Logger logger2=LoggerFactory.getLogger(HomeController.class);
	private PushNotificationService service;
	
	
	public HomeController(PushNotificationService service) {
		this.service=service;
	}
	
	@GetMapping("/notification")
	public String msg() {
		return "Hiii";
	}
	
	@PostMapping("/notification")
    public ResponseEntity<PushNotificationResponse> sendTokenNotification(@RequestBody PushNotificationRequest request) {
		logger2.info("Controller..................................");
        service.sendPushNotificationToToken(request);
        return new ResponseEntity<>(new PushNotificationResponse(HttpStatus.OK.value(), "Notification has been sent."), HttpStatus.OK);
    }
}
