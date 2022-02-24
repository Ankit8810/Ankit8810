package com.apigetway.controller;

import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableHystrix
public class FallbackController {

	@GetMapping("/userfallback")
	public String userService() {
		return "User Service is down at this time!!";
	}
	
	@GetMapping("/contractfallback")
	public String contractService() {
		return "Contracts Service is down at this time!!";
	}
}
