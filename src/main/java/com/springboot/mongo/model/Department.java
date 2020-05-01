/**
 * 
 */
package com.springboot.mongo.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author jyotibikashsahoo
 *
 */
@Document("Department")
public class Department {
	
	@Id
	private String id;
	
	@Indexed(name = "deptName")
	private String name;
	private String description;
	
	//@DBRef
	private List<Employee> employees;

	/**
	 * 
	 */
	public Department() {
		super();
	}

	/**
	 * @param id
	 * @param name
	 * @param description
	 * @param employees
	 */
	public Department(String id, String name, String description, List<Employee> employees) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.employees = employees;
	}

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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the employees
	 */
	public List<Employee> getEmployees() {
		return employees;
	}

	/**
	 * @param employees the employees to set
	 */
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	
	

}
