package com.luv2code.hibernet.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
								 .configure("hibernate.cfg.xml")
								 .addAnnotatedClass(Student.class)
								 .buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			Student tempStudent1 = new Student("Paul", "Wall", "paul@luv2code.com");
			Student tempStudent2 = new Student("vivek", "public", "mary@luv2code.com");
			Student tempStudent3 = new Student("viv", "Applebaum", "bonita@luv2code.com");
			session.beginTransaction();
			session.save(tempStudent1);
			session.save(tempStudent2);
			session.save(tempStudent3);
			session.getTransaction().commit();
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}

	}
}
