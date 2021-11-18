package com.backend.dev.demo.dao;

import java.util.List;

import com.backend.dev.demo.model.Employee;

public interface EmployeeDao {
	
	int addEmployee(Employee emp);

	List<Employee> getEmployee();

	Employee getEmployeeByid(int empId);

	int deleteEmployee(int id);

	boolean updateEmployee(Employee emp);

}
