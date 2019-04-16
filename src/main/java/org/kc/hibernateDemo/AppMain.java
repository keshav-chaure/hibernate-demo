package org.kc.hibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class AppMain {

	@SuppressWarnings("deprecation")
	private static SessionFactory buildSessionFactory(){
		SessionFactory sessionFactory=null;
		Configuration config=new Configuration();
		sessionFactory=config.configure("hibernate.cfg.xml").buildSessionFactory();
		
		return sessionFactory;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session currentSession = AppMain.buildSessionFactory().getCurrentSession();
		System.out.println(currentSession);

	}

}
