package com.pradhan.cliend;

import com.pradhan.dao.StudentDAO;
import com.pradhan.dao.impl.StudentDAOImpl;
import com.pradhan.entity.Student;

public class Test {

	public static void main(String[] args) {
		
		StudentDAO dao = new StudentDAOImpl();
		
//		creating Student object
		
//		Student student = new Student();
		
//		student.setSid(00222);
//		student.setSname("prague");
//		student.setGender("male");
//		student.setMarks(600);
//		
//		dao.saveStudent(student);
		
		//load from database
		/*
		Student student  = dao.loadStudent(11221);
		System.out.println(student);
		*/
		
		//update
		/*
		Student stu = dao.updateStudent(11221, 500);
		System.out.println(stu);
		*/
		
		//Delete
		dao.deleteStudent(11221);
		
		
		
		
		

	}

}
