package com.rbl.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.raghava.dto.UserDetails;

public class Operation {
	
	
	public static void main(String[] args)
	{
		UserDetails details=new UserDetails();
		details.setUserId(1);
		details.setUserName("Firstuser");
		
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		
		session.beginTransaction();
		session.save(details);
        session.getTransaction().commit();
		
	}

}
