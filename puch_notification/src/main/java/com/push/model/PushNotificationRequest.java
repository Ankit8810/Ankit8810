package com.push.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PushNotificationRequest {
	
	    private String title;
	    private String message;
	    private String topic;
	    private String token;
	   
}
