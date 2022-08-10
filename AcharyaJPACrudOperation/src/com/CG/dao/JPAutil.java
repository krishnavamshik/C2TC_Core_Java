package com.CG.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAutil
{
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	static {factory = Persistence.createEntityManagerFactory("JPA-PU");}
	
public static EntityManager getEntityManager() {
	if(manager==null||!manager.isOpen())
	{
		manager = factory.createEntityManager();
	}
	return manager;
}

}

