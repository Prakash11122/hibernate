package com.pradhan.dao;

import java.util.List;

import com.pradhan.entity.EmployeeEntity;

public interface EmployeeDao {
	
	EmployeeEntity saveEmp(EmployeeEntity employeeEntity);

	EmployeeEntity featchEntityByid(Integer empno);
	
	List<EmployeeEntity> fetchEmployee();
	
	List<Object[]> fetchNamesAndSalaries();
}
