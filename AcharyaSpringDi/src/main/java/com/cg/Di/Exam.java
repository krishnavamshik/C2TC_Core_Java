package com.cg.Di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("Beans.xml");
		Student s1 = c.getBean("student", Student.class);
		s1.display();
	}

}
