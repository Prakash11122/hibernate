package com.pradhan.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import com.pradhan.dao.StudentDAO;
import com.pradhan.entity.Student;

public class StudentDAOImpl implements StudentDAO {

	SessionFactory factory;

	// Constructor
	public StudentDAOImpl() {
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
		factory = metadata.getSessionFactoryBuilder().build();

	}

	@Override
	public void saveStudent(Student student) {

		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		try {
			session.save(student);
			System.out.println("student object is persisted in database");
			t.commit();
		} catch (Exception ex) {
			t.rollback();
			System.out.println("issue in persisting student object");
			System.out.println(ex);
		} finally {
			session.close();
			factory.close();
		}

	}

	@Override
	public Student loadStudent(int sid) {
//		load() = > lazy loading 
//		get() => early loading
//		args  1.classname.lass
//		      2.id value
		Session session = factory.openSession();
		Student stu = session.get(Student.class, sid);
		session.close();
		return stu;
	}

	@Override
	public Student updateStudent(int sid, int marks) {
		Session session = factory.openSession();
		Student s = session.get(Student.class, sid);
		Transaction t = session.beginTransaction();
		try {
			s.setMarks(marks);
			session.update(s);
			t.commit();
			System.out.println("object is updated ....");
		} catch (Exception e) {
			t.rollback();
			System.out.println("object is not updated .....");
		}finally {
			session.close();
		}
		return s;
	}

	@Override
	public void deleteStudent(int sid) {
		Session session = factory.openSession();
		Student s = session.get(Student.class, sid);
		Transaction t = session.beginTransaction();
		try {
			session.delete(s);
			System.out.println("object is deleted .......");
			t.commit();
			
		} catch (Exception e) {
			t.rollback();
			System.out.println("object is not deleted......");
		}finally {
			session.close();
		}
		
	}
	
	

}
