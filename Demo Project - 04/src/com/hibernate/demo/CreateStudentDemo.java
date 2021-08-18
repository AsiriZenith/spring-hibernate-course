package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
		
		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			// create a student object
			Student student = new Student("Asiri","Manjitha","asirimanjitha@gmail.com");
			
			// start a transaction
			session.beginTransaction();
			
			// save the student object
			session.save(student);
			
			// commit the transaction
			session.getTransaction().commit();
			
			System.out.println("Done!!");
		}
		catch (Exception e) {
			System.out.println("Hello!");
			e.printStackTrace();
		}
		finally {
			factory.close();
		}
	}

}
