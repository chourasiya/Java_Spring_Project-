package com.luv2code.hibernet.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Review;

public class CreateCoursesDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
								 .configure("hibernate.cfg.xml")
								 .addAnnotatedClass(Instructor.class)
								 .addAnnotatedClass(InstructorDetail.class)
								 .addAnnotatedClass(Course.class)
								 .buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.beginTransaction();
			Course tempCourse = new Course("Pacman - How To Score One Million Points");
			tempCourse.add(new Review("Greate course .... lves it"));
			tempCourse.add(new Review("Cool course, job well done"));
			tempCourse.add(new Review("What a dumb course, you are an idiot"));
			session.save(tempCourse);
			
			session.getTransaction().commit();
			System.out.println("Done!");
		}
		finally {
			session.close();
			factory.close();
		}

	}

}
