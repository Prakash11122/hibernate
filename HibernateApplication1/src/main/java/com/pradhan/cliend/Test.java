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
		
		Student student  = dao.loadStudent(219);
		System.out.println(student);
		
		
		
		
		

	}

}
