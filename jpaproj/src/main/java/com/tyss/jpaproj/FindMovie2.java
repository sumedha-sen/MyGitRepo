package com.tyss.jpaproj;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tyss.jpaproj.bean.Movies;

public class FindMovie2 {

	public static void main(String[] args) {
		
		
		EntityManagerFactory managerFactory=null;
		EntityManager  manager=null;
		try {
			managerFactory=Persistence.createEntityManagerFactory("MoviesData");
			manager=managerFactory.createEntityManager();
           // Movies movie1=manager.find(Movies.class, 10);
			Movies movie1=manager.getReference(Movies.class,20);
			System.out.println(movie1.getId());
			System.out.println(movie1.getName());
			System.out.println(movie1.getRating());
			System.out.println(movie1.getReviews());


		}catch(Exception e) {
			e.printStackTrace();
		}

		finally {
			if(manager!=null) {
				manager.clear();
			}
			if(managerFactory!=null)
				managerFactory.close();
		}

	}
}

