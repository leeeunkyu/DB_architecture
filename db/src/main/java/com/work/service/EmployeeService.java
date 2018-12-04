package com.work.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.work.dao.EmployeeDao;
import com.work.dto.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	public void signUp(Employee employee) {
		employeeDao.signUp(employee);
	}

	public int signIn(Employee employee) {
		return employeeDao.signIn(employee);		
	}

	public List<Employee> selectEmployeeList(int index) {
		return employeeDao.selectEmployeeList(index);
	}

}
