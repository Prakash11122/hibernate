package com.pradhan.test;

import java.util.List;

import com.pradhan.dao.EmployeeDao;
import com.pradhan.dao.impl.EmployeeDaoImpl;
import com.pradhan.entity.EmployeeEntity;

public class Tester {
	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDaoImpl();	
//		EmployeeEntity empEntity = new EmployeeEntity();
//		empEntity.setEmpName("kripali");
//		empEntity.setDeptNumber(333444);
//		empEntity.setEmpNumber(20000);
//		empEntity.setSalary(70000.0);
//		dao.saveEmp(empEntity);
		
		/*
		 * Fetch Single Entity by id
		 */
		
		/*
		EmployeeEntity emp = dao.featchEntityByid(8899);
		System.out.println(emp); */
		
		
		/*
		 * Fetch all Entity 
		 */
		
//		List<EmployeeEntity> lst = dao.fetchEmployee();
//		//System.out.println(lst);
//		lst.forEach(System.out::println);
		
		/*
		 * Fetch name and salary
		 */
		
		List<Object[]> list1 = dao.fetchNamesAndSalaries();
		list1.forEach(obj -> {
			System.out.println(obj[0]+ " + " + obj[1] );
		});
		 
	}

}
