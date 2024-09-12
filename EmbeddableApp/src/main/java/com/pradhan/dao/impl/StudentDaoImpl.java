package com.pradhan.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.pradhan.dao.StudentDao;
import com.pradhan.entity.StudentCompositeKey;
import com.pradhan.entity.StudentEntity;

public class StudentDaoImpl implements StudentDao {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

	@Override
	public void saveStudent(StudentEntity entity) {
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		try {
			entityManager.persist(entity);
			tx.commit();
			System.out.println("Student entity is persisted to the db");
		} catch (Exception ex) {
			tx.rollback();
			System.out.println("issue in persisting entity");
		} finally {
			entityManager.close();
		}

	}

	@Override
	public StudentEntity fetchStudent(StudentCompositeKey compositeKey) {
		EntityManager entityManager = factory.createEntityManager();
		StudentEntity entity = entityManager.find(StudentEntity.class, compositeKey);
		entityManager.close();
		return entity;
	}

}
