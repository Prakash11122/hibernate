package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Song;

public class ReadApp {
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
		Song song = session.get(Song.class, 1);
		System.out.println(song);
	}
}
