package com.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Song;

public class HibernateUtils {

	private static SessionFactory sessionFactory = null;

	public static SessionFactory getSessionFactory() {

		if (sessionFactory == null) {

			// create configuration
			Configuration configuration = new Configuration();
			// configuration.configure("hibernate.cfg.xml"); if you remove this
			// configuration file still it work fine,.
			configuration.configure();
			configuration.addAnnotatedClass(Song.class);
			// create session factory
			sessionFactory = configuration.buildSessionFactory();

		}
		return sessionFactory;
	}

}
