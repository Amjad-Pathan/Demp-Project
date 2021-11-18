package com.backend.dev.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.dev.demo.dao.EmployeeDao;
import com.backend.dev.demo.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao empDao;

	public int addEmployee(Employee emp) {
		return empDao.addEmployee(emp);
	}

	public List<Employee> getEmployee() {
		return empDao.getEmployee();
	}

	public Employee getEmployeeByid(int empId) {
		return empDao.getEmployeeByid(empId);
	}

	public int deleteEmployee(int id) {
		return empDao.deleteEmployee(id);
	}

	public boolean updateEmployee(Employee emp) {		
		return empDao.updateEmployee(emp);
	}

}
