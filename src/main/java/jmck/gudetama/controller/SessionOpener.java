package jmck.gudetama.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionOpener {
	
	private static SessionFactory sessionFactory;

	static{
		try{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		}catch(Throwable ex){
			System.out.println("Session facotry failed"+ ex);
			throw new ExceptionInInitializerError(ex);
		}
		
	}
	
	public static Session openSession(){
			return sessionFactory.openSession();
	}
	
}

