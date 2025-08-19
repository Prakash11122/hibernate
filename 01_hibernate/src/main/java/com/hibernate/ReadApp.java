package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.entity.Song;
import com.hibernate.util.HibernateUtils;

public class ReadApp {

	public static void main(String[] args) {

		SessionFactory sessionFactory =HibernateUtils.getSessionFactory();

		Session session = sessionFactory.openSession();
		Song song = session.get(Song.class, 2);
		System.out.println(song);
	}

}
