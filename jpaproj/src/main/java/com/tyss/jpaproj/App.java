package com.tyss.jpaproj;

import com.tyss.jpaproj.bean.Movies;
import javax.persistence.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Movies movies=new Movies();
       movies.setId(30);
       movies.setName("ddlg");
       movies.setRating(9);
       movies.setReviews("Romcom");
       
       EntityManagerFactory managerFactory=null;
       EntityManager entityManager=null;
       EntityTransaction transaction=null;
       
     try {
    	 
    	  managerFactory=Persistence.createEntityManagerFactory("MoviesData");
          entityManager=managerFactory.createEntityManager();
          transaction=entityManager.getTransaction();
          transaction.begin();
          entityManager.persist(movies);
          
          System.out.println("inserted data");

          transaction.commit();
    	 
     }
      catch(Exception e) {
    	  
    	  if(transaction!=null) {
    		  transaction.rollback();
    	  }
    	  e.printStackTrace();
      
      }
     
     finally {
    	 if(entityManager!=null) {
    		 entityManager.close();
    	 }
    	 if(managerFactory!=null) {
    		 entityManager.close();
    	 }
     }
       
       
       
       
       
    }
}
