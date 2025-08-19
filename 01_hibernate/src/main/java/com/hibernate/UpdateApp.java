package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.entity.Song;
import com.hibernate.util.HibernateUtils;

public class UpdateApp {
	public static void main(String[] args) {

		SessionFactory sessionFactory =HibernateUtils.getSessionFactory();
		if(sessionFactory != null) {
		Session session = sessionFactory.openSession();

		session.beginTransaction();
		Song song = session.get(Song.class, 2);
		//song.setSongName("KALIA RE Update"); // Hibernate will detect this change
		System.out.println(song);
		session.getTransaction().commit(); // Automatically updates
		
		session.close();
		sessionFactory.close();
	}
}
}
