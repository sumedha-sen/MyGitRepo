package com.te.sprmvc.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name="employee")
public class EmployeeBean implements Serializable {
	
	@Id
	@Column(name="userid")
	private Integer id;
	
	@Column(name="username")
	private String name;
	
	@Column(name="dob")
	private Date dob;
	
	@Column(name="password")
	private String password;

}
