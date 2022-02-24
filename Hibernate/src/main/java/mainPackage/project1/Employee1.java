package mainPackage.project1;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="emp")
public class Employee1 {
	
	@Id
	@Column(name="employee_Id")
	private long employeeId;
	@Column(name="employee_name")
	private String employeeName;
	private List<Employee1> emp;

}
