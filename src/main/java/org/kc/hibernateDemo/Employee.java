package org.kc.hibernateDemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@Column(name="EmpID")
	private int empID;
	
	@Column(name="Name")
	private String empName;
	
	@Column(name="Age")
	private int age;
	@Column(name="Salary")
	private double salary;
	
	@Column(name="DeptID")
	private int deptID;

}
