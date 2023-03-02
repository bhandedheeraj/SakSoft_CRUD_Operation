package com.hibernates;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory =configuration.buildSessionFactory();
		
		Session session =sessionFactory.openSession();
		
		Transaction transaction =session.beginTransaction();
		
		//Set values into student object
		Student student=new Student();
		student.setFirstName("Dheeraj");
		student.setLastName("Bhande");
		student.setEmailD("dheerajbhande@gmail.com");
		student.setAge("24");
		
		
		//Internally insert query will be execute
		session.save(student);
		transaction.commit();  // Data Save
	   System.out.println("Records are inserted Successfully");
	}
}
