 package com.contact.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Contracts {

	@Id
	private Long userId;
	private Long customerId;
	private String email;
	private String contactName;
	
}
