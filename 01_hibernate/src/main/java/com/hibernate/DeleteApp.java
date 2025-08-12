package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.entity.Song;
import com.hibernate.util.HibernateUtils;

public class DeleteApp {
	public static void main(String[] args) {

		SessionFactory sessionFactory =HibernateUtils.getSessionFactory();

		Session session = sessionFactory.openSession();

		session.beginTransaction();

		Song song = session.get(Song.class, 3);

		session.delete(song);

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}
}
