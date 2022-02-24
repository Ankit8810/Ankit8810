package com.contact.model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

	@Id
	private Long user_id;
	@Column( updatable = false)
	private String user_name;
	private String phone;
	@OneToOne(cascade = CascadeType.ALL)
	private Contracts contracts;
	
	
}
