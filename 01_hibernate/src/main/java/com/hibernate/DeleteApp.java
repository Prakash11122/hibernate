package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Song;

public class DeleteApp {
	public static void main(String[] args) {

		// create configuration
		Configuration configuration = new Configuration();
		// configuration.configure("hibernate.cfg.xml"); if you remove this
		// configuration file still it work fine,.
		configuration.configure();
		configuration.addAnnotatedClass(Song.class);

		// create session factory
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();
		
		
		session.beginTransaction();
		
		Song song = session.get(Song.class, 3);
		
		session.delete(song);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}
}
