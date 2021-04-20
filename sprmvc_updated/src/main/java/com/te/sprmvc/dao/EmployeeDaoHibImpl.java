package com.te.sprmvc.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.te.sprmvc.beans.EmployeeBean;

@Repository
public class EmployeeDaoHibImpl implements EmployeeDao {

	public EmployeeBean authenticate(int id, String password) {
		// TODO Auto-generated method stub
		

//		EntityManagerFactory factory=null;
//		EntityManager manager=null;
		
		
		
		try {
			EntityManagerFactory factory=Persistence.createEntityManagerFactory("employee");
			
			EntityManager manager=factory.createEntityManager();
			EmployeeBean bean=manager.find(EmployeeBean.class,id);
			
			if(bean!=null) {
				
	          if(bean.getPassword().equals(password)) {
	        	  System.out.println("Login success");
	        	  return bean;
	        	  
	          }else {
	        	  System.out.println("Login not successful");
	        	  return null;
	          }
			}
			return bean;
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		return null;
		
			
		
	}

	@Override
	public EmployeeBean getEmployee(int id) {
		// TODO Auto-generated method stub
		try {
			EntityManagerFactory factory=Persistence.createEntityManagerFactory("employee");
			
			EntityManager manager=factory.createEntityManager();
			EmployeeBean bean=manager.find(EmployeeBean.class,id);
			
			if(bean!=null) {
				
	         
	        	  return bean;
	        	  
	          }else {
	        	  System.out.println("Login not successful");
	        	  return null;
	          }
			
			
			
			
		//return bean;
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		return null;
	}

	@Override
	public boolean deleteEmpData(int id) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("employee");
		
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		try {
			
			transaction.begin();
			EmployeeBean bean=manager.find(EmployeeBean.class,id);
			manager.remove(bean);
			transaction.commit();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		// TODO Auto-generated method stub
		
		
		return false;
	}

}
