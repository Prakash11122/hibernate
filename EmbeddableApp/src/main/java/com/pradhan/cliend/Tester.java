package com.pradhan.cliend;

import com.pradhan.dao.StudentDao;
import com.pradhan.dao.impl.StudentDaoImpl;
import com.pradhan.entity.StudentCompositeKey;
import com.pradhan.entity.StudentEntity;

public class Tester {

	public static void main(String[] args) {
		
		StudentDao dao = new StudentDaoImpl();
		
		/*
		 * save a student entity
		 **/
		
//		StudentCompositeKey compositeKey = new StudentCompositeKey();
//		compositeKey.setRollNumber(555);
//		compositeKey.setSection("B");
//		
//		StudentEntity entity = new StudentEntity();
//		entity.setCompositeKey(compositeKey);
//		entity.setMarks(700);
//		entity.setStudentName("kumar");
//		
//		
//		dao.saveStudent(entity);
		
		
		/*
		 * fetchStudent a student entity
		 **/
		StudentCompositeKey compositeKey = new StudentCompositeKey();
		compositeKey.setRollNumber(555);
		compositeKey.setSection("B");
		
		StudentEntity entity = dao.fetchStudent(compositeKey);
		System.out.println("name :"+ entity.getStudentName());
		System.out.println("marks :"+  entity.getMarks());
		
		

	}

}
