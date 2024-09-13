package com.pradhan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Emp")
public class EmployeeEntity {
	@Id
	@Column(name = "empno")
	private Integer empNumber;
	@Column(name = "empname")
	private String empName;
	@Column(name = "salary")
	private Double Salary;
	@Column(name = "deptno")
	private Integer deptNumber;
	public Integer getEmpNumber() {
		return empNumber;
	}
	public void setEmpNumber(Integer empNumber) {
		this.empNumber = empNumber;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getSalary() {
		return Salary;
	}
	public void setSalary(Double salary) {
		Salary = salary;
	}
	public Integer getDeptNumber() {
		return deptNumber;
	}
	public void setDeptNumber(Integer deptNumber) {
		this.deptNumber = deptNumber;
	}
	
	

}
