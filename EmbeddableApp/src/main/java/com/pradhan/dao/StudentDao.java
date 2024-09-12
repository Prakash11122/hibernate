package com.pradhan.dao;

import com.pradhan.entity.StudentCompositeKey;
import com.pradhan.entity.StudentEntity;

public interface StudentDao {
	
	
	void saveStudent(StudentEntity entity);
	
	StudentEntity fetchStudent(StudentCompositeKey compositeKey);

}
