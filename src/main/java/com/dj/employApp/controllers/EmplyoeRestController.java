package com.dj.employApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dj.employApp.Service.EmployeeService;
import com.dj.employApp.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmplyoeRestController {
	@Autowired
	private EmployeeService service;

	// 1. save
	@PostMapping("/create")
	public ResponseEntity<String> saveEmployee(@RequestBody Employee emp) {
		Integer id = service.saveEmployee(emp);
		String body = "Employee saved with Id" + id;
		return ResponseEntity.ok(body);
	}

	// 2. fetch all
	@GetMapping("/all")
	public ResponseEntity<List<Employee>> getAllEmployee() {
		List<Employee> list = service.getAll();
		return ResponseEntity.ok(list);
	}

	@GetMapping("/one/{id}")
	public ResponseEntity<Employee> getOneEmployee(@PathVariable Integer id) {
		Employee emp = service.getEmployeeById(id);
		return ResponseEntity.ok(emp);
	}

	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable Integer id) {
		service.deleteEmployee(id);
		String body = "Employee deleted!" + id;
		return ResponseEntity.ok(body);

	}
	// 5. update

	@PutMapping("/update")
	public ResponseEntity<String> updateEmployee(@RequestBody Employee emp) {
		service.updateEmployee(emp);
		String body = "updated employee" + emp.getId();
		return ResponseEntity.ok(body);

	}

}
