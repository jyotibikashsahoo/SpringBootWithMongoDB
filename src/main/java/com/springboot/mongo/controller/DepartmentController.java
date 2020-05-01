/**
 * 
 */
package com.springboot.mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.mongo.model.Department;
import com.springboot.mongo.repository.DepartmentRepository;

/**
 * @author jyotibikashsahoo
 *
 */
@RestController
@RequestMapping("/dept")
public class DepartmentController {

	@Autowired
	private DepartmentRepository departmentRepository;

	@PostMapping("/createDept")
	public ResponseEntity<Department> createDept(@RequestBody Department department) {
		Department department1 = departmentRepository.save(department);
		ResponseEntity<Department> responseEntity = new ResponseEntity<Department>(department1, HttpStatus.CREATED);
		return responseEntity;
	}

	@PutMapping("/updateDept/{deptName}")
	public ResponseEntity<Department> updateDept(@RequestBody Department department, @PathVariable String deptName) {
		ResponseEntity<Department> response = null;
		department.setName(deptName);
		Department department2 = departmentRepository.save(department);
		if (department2 != null) {
			response = new ResponseEntity<Department>(department2, HttpStatus.OK);
		}
		return response;
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Department>> getAllDepartment(){
		List<Department> departMentList = departmentRepository.findAll();
		if(!departMentList.isEmpty()) {
		return new ResponseEntity<List<Department>>(departMentList, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<List<Department>>(departMentList, HttpStatus.NO_CONTENT);
		}
	}
}
