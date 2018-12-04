package com.work.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.work.dto.Employee;

@Repository
public class EmployeeDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public void signUp(Employee employee) {
		try {
			int count = sqlSession.insert("employee.signUp", employee);
			if(count > 0) {
			}
		} catch (PersistenceException e) {
		}
	}

	public int signIn(Employee employee) {
		try {
			String result = sqlSession.selectOne("employee.signIn", employee.getEmpId());
			if(employee.getEmpPwd().equals(result)) {
				return 3;
			}
		} catch (PersistenceException e) {
			e.printStackTrace();
			return 9;
		}
		return 4;
	}

	public List<Employee> selectEmployeeList(int index) {
		try {
			index = (index-1)*10;
			List<Employee> employeeList = sqlSession.selectList("employee.selectEmployeeList", index);
			return employeeList;
		} catch (PersistenceException e) {
			e.printStackTrace();
			return null;
		}
	}

}
