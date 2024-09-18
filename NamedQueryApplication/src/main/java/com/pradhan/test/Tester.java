package com.pradhan.test;

import java.util.List;

import com.pradhan.dao.EmpDAO;
import com.pradhan.dao.Impl.EmpDaoImpl;
import com.pradhan.entity.EmployeeEntity;

public class Tester {

	public static void main(String[] args) {
		
		EmpDAO dao = new EmpDaoImpl();
//		List<EmployeeEntity> executeNamedQuery = dao.executeNamedQuery(12321);
//		executeNamedQuery.forEach(System.out::println);
		
		List executeNamedNativeQuery = dao.executeNamedNativeQuery(9000);
		executeNamedNativeQuery.forEach(System.out::println);
		

	}

}
