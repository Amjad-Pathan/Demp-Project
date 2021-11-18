package com.backend.dev.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.dev.demo.model.Employee;
import com.backend.dev.demo.service.EmployeeService;

/*Simple Rest CRUD application with Default Spring Boot database (H2)*/

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService empService;

	@PostMapping
	public int addEmployee(@RequestBody Employee emp) {
		return empService.addEmployee(emp);
	}

	@GetMapping
	public List<Employee> getEmployee() {
		return empService.getEmployee();
	}

	@GetMapping(path = "{id}")
	public Employee getEmployeeByid(@PathVariable("id") int id) {
		return empService.getEmployeeByid(id);
	}

	@DeleteMapping(path = "{id}")
	public int deleteEmployee(@PathVariable("id") int id) {
		return empService.deleteEmployee(id);
	}

	@PutMapping
	public boolean updateEmployee(@RequestBody Employee emp) {
		return empService.updateEmployee(emp);
	}

}
