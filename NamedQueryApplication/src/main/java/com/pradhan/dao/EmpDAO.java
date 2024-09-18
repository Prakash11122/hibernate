package com.pradhan.dao;

import java.util.List;

import com.pradhan.entity.EmployeeEntity;

public interface EmpDAO {
	
	List<EmployeeEntity> executeNamedQuery(int deptno);
	List executeNamedNativeQuery(int sal);

}
