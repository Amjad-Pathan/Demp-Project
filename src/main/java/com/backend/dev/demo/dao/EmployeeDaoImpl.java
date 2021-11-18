package com.backend.dev.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.backend.dev.demo.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	List<Employee> employees = new ArrayList<>();

	@Override
	public int addEmployee(Employee emp) {
		employees.add(emp);
		return 1;
	}

	@Override
	public List<Employee> getEmployee() {
		return employees;
	}

	@Override
	public Employee getEmployeeByid(int empId) {
		for (Employee emp : employees) {
			if (emp.getEmpId() == empId)
				return emp;
		}
		return null;
	}

	@Override
	public int deleteEmployee(int id) {
		for (Employee emp : employees) {
			if (emp.getEmpId() == id) {
				employees.remove(emp);
				return 1;
			}
		}
		return 0;
	}

	@Override
	public boolean updateEmployee(Employee emp) {

		for (Employee empl : employees) {
			if (empl.getEmpId() != emp.getEmpId()) {
				employees.remove(empl);
				employees.add(emp);
				return true;
			}
		}
		return false;
	}

}
