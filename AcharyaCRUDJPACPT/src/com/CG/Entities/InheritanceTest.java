package com.CG.Entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class InheritanceTest {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em= factory.createEntityManager();
		em.getTransaction().begin();
		
		//create one employee
		Employee employee = new Employee();
		employee.setName("krishna");
		employee.setSalary(10000);
		em.persist(employee);
		
		//create one manager
		Manager manager = new Manager();
		manager.setName("lewis");
		manager.setSalary(50000);
		manager.setDepartmentName("sales");
		em.persist(manager);
		
		em.getTransaction().commit();
		System.out.println("Added one employee and manager");
		em.close();
		factory.close();


	}

}
