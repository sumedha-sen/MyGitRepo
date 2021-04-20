package com.te.sprmvc.service;

import com.te.sprmvc.beans.EmployeeBean;

public interface Service {
	
	public EmployeeBean authenticate(int id, String password);

	public EmployeeBean getEmployee(int id);
	
	public boolean deleteEmpData(int id);
	
	
	


}
