package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main( String[] args )
	{
		System.out.println( "Hello World!" );
		//SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Configuration configuration= new Configuration();
		configuration.configure("hb.config.xml");
		SessionFactory factory= configuration.buildSessionFactory();
		// Session currentSession = factory.getCurrentSession();
		//create student object
        Student st=new Student();
        st.setId(2);
        st.setName("Zaid");
        st.setCity("Mumbai");
        System.out.println(st);
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(st);
        Transaction transaction = session.getTransaction();
        transaction.commit();
        session.close();
        
		
	}
}
