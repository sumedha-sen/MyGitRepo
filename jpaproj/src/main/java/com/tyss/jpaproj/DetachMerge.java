package com.tyss.jpaproj;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpaproj.bean.Movies;

public class DetachMerge {
public static void main(String[] args) {
		EntityManagerFactory managerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
	          managerFactory=Persistence.createEntityManagerFactory("MoviesData");
			 entityManager=managerFactory.createEntityManager();
			 transaction=entityManager.getTransaction();
			transaction.begin();
			
			Movies movies= entityManager.find (Movies.class, 10);
			System.out.println(entityManager.contains(movies));
			entityManager.detach(movies);
			
			System.out.println("AFTER DETACH");
			System.out.println(entityManager.contains(movies));
            movies.setName("sara");
           Movies mergerdData=entityManager.merge(movies);
           mergerdData.setName("roy");
            
			transaction.commit();
		} catch (Exception e) {
			if (transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} 
		finally {
			if (entityManager!=null) {
				entityManager.close();
			}
			if (managerFactory!=null) {
				managerFactory.close();
			}
			
		}
		
	}

}

