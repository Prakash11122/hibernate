package com.hibernate.entity.test;

import org.hibernate.SessionFactory;

import com.hibernate.util.HibernateUtils;

public class Test {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory1 = HibernateUtils.getSessionFactory();
		SessionFactory sessionFactory2 = HibernateUtils.getSessionFactory();
		
		if(sessionFactory1 == sessionFactory2) {
			System.out.println("two of session factory are same");
		}
		
		
		System.out.println(sessionFactory1 + " - " + sessionFactory2);
		
	}

	

}
