package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Song;

public class CreateApp {
	public static void main(String[] args) {

		// create configuration
		Configuration configuration = new Configuration();
		// configuration.configure("hibernate.cfg.xml"); if you remove this
		// configuration file still it work fine,.
		configuration.configure();
		configuration.addAnnotatedClass(Song.class);

		// create session factory
		SessionFactory sessionFactory = configuration.buildSessionFactory();

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
