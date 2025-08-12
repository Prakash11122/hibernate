package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Song;

public class UpdateApp {
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
		song.setSongName("KALIA RE Update"); // Hibernate will detect this change

		session.getTransaction().commit(); // Automatically updates

		session.close();
		sessionFactory.close();
	}
}
