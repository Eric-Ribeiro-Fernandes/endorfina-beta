package br.com.ericribeiro.endorfinabeta.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUil {
	
	private static final EntityManagerFactory FACTORY = Persistence
			.createEntityManagerFactory("Endorfina");
	
	
	public static EntityManager getEntityManager() {
		return FACTORY.createEntityManager();
	}

}
