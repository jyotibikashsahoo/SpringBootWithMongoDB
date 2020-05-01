/**
 * 
 */
package com.springboot.mongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @author jyotibikashsahoo
 *
 */
@Document("Employee")
public class Employee {
	
	@Id
	private String empId;
	
	@Field("empName")
	private String name;
	
	@Field("empAge")
	private int age;
	
	@Field("empSalary")
	private double salary;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * @return the empId
	 */
	public String getEmpId() {
		return empId;
	}

	/**
	 * @param empId
	 * @param name
	 * @param age
	 * @param salary
	 */
	public Employee(String empId, String name, int age, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	/**
	 * 
	 */
	public Employee() {
		super();
	}
	
	

}
