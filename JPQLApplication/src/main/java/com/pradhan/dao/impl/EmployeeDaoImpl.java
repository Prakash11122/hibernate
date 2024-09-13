package com.pradhan.dao.impl;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.pradhan.dao.EmployeeDao;
import com.pradhan.entity.EmployeeEntity;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
	

	@Override
	public EmployeeEntity featchEntityByid(Integer empno) {
		
		return null;
	}

	@Override
	public List<EmployeeEntity> fetchEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object[]> fetchNamesAndSalaries() {
		// TODO Auto-generated method stub
		return null;
	}

}
