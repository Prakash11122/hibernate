package com.hibernate._hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {	
    	
    	//create configuration
    	Configuration configuration = new Configuration();
    	configuration.configure("hibernate.cfg.xml");
    	
    	//create session factory
    	SessionFactory sessionFactory = configuration.buildSessionFactory();
    	
    	
    	
    	//initialize the session object
    	Session session = sessionFactory.openSession();
    	
    	
    	
        Song song1 = new Song();
        song1.setId(5);
        song1.setSongName("saiyyan");
        song1.setArtist("Kailash");
        
        session.save(song1);
        System.out.println("song saved...");
    }
}
