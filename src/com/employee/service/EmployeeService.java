package com.employee.service;

import java.util.List;

import com.employee.dao.EmployeeDao;
import com.employee.model.Employee;

public class EmployeeService {

	private EmployeeDao employeeDao;

	public EmployeeService() {
		super();
		employeeDao = new EmployeeDao();
	}
	
	public void save(Employee employee) {
		employeeDao.save(employee);
	}
	
	public List<Employee> getEmployees(){
		return employeeDao.getEmployees();
	}

}
