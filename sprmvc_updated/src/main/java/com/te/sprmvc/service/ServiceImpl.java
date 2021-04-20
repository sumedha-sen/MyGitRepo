package com.te.sprmvc.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.te.sprmvc.beans.EmployeeBean;
import com.te.sprmvc.dao.EmployeeDao;



public class ServiceImpl implements Service {
	
	@Autowired
	EmployeeDao dao;

	public EmployeeBean authenticate(int id, String password) {
		
		dao.authenticate(id, password);
		
		// TODO Auto-generated method stub
		return null;
	}

	public EmployeeBean getEmployee(int id) {
		
		dao.getEmployee(id);
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteEmpData(int id) {
		
		dao.deleteEmpData(id);
		// TODO Auto-generated method stub
		return false;
	}

}
