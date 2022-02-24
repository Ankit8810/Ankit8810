package mainPackage;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
@Table(name="emp")
public class Employee {

	@Id
	@Column(name="Employee_Id")
	private long id;
	//@Column(name="Employee-Name")
	private String employeeName;
	//@Column(name="Employee_City")
	private String city;
}
