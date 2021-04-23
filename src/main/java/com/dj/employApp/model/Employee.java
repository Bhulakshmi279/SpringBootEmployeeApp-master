package com.dj.employApp.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="emptab")
public class Employee implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String firstName;
	private String lastName;
	private String EmployementId;
	private Date startDate;
	private String designation;
	private Date endDate;
	private String status;
	private Date DOB;
	private String reportingManager;
	private String gender;
	private String bloodGroup;
	private String address;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="empId")
	private Set<EmpDependants> empDependent;
}
