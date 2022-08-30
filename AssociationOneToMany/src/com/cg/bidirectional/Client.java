package com.cg.bidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Department department = new Department();
		department.setId(10);
		department.setName("devloper");
		
		Department department1 = new Department();
		department.setId(2);
		department.setName("sales");
		
		Employee e1 = new Employee();
		e1.setName("krishna");
		e1.setSalary(20000);
		
		Employee e2 = new Employee();
		e2.setName("lewis");
		e2.setSalary(2000);
		
		department.addEmployee(e1);
		department1.addEmployee(e2);
		
		em.persist(department);
		em.persist(department1);
		System.out.println("added dept and employee");
		em.getTransaction().commit();
		em.close();
		factory.close();
	}

}
