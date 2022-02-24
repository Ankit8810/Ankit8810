package com.user.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class User {

	@Id
	private Long user_id;
	@Column( updatable = false)
	private String user_name;
	private String phone;
//	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	@OneToOne(cascade = CascadeType.ALL)
	private Contracts contracts;
}
