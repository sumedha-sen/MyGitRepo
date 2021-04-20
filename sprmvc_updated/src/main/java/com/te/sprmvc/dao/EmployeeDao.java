package com.te.sprmvc.dao;

import com.te.sprmvc.beans.EmployeeBean;

public interface EmployeeDao {
	

	public EmployeeBean authenticate(int id, String password);

	public EmployeeBean getEmployee(int id);

	public boolean deleteEmpData(int id);

}
