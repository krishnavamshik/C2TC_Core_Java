package com.cg.Association;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Student student = new Student();
		student.setName("Krishna");
		
		
		Address address = new Address();
		address.setStreet("KHB colony");
		address.setCity("Bengaluru");
		address.setState("Karnataka");
		address.setZipcode("561209");
		student.setAdress(address);
		
		em.persist(student);
		em.getTransaction().commit();
		em.close();

	}

}
