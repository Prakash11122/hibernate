package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.entity.Song;
import com.hibernate.util.HibernateUtils;

public class CreateApp {
	public static void main(String[] args) {
		
		SessionFactory sessionFactory =HibernateUtils.getSessionFactory();

		// initialize the session object
		Session session = sessionFactory.openSession();

		Song song1 = new Song();

		song1.setId(04);
		song1.setSongName("kalia re");
		song1.setArtist("by prakash");

		session.beginTransaction();
		session.save(song1);
		session.getTransaction().commit();

		session.save(song1);

		System.out.println("song saved...saiyyan");
	}
}
