package com.pradhan.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.pradhan.constants.AppConstants;
import com.pradhan.dao.EmployeeDao;
import com.pradhan.entity.EmployeeEntity;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
	

	@Override
	public EmployeeEntity featchEntityByid(Integer empno) {
		
		EntityManager em = factory.createEntityManager();
		TypedQuery<EmployeeEntity> tq = em.createQuery(AppConstants.QUERY1, EmployeeEntity.class);
		tq.setParameter(1, empno);
		EmployeeEntity e = tq .getSingleResult();
		em.close();
		
		return e; 
	}

	@Override
	public List<EmployeeEntity> fetchEmployee() {
		EntityManager em = factory.createEntityManager();
		TypedQuery<EmployeeEntity> tq = em.createQuery(AppConstants.QUERY2, EmployeeEntity.class);
		List<EmployeeEntity> lstEmployee = tq.getResultList();
		em.close();
		 
		return lstEmployee;
	}

	@Override
	public List<Object[]> fetchNamesAndSalaries() {
		EntityManager em = factory.createEntityManager();
		TypedQuery<Object[]> tq = em.createQuery(AppConstants.QUERY3, Object[].class);
		List<Object[]> lst = tq.getResultList();
		em.close();
		

		return lst;
	}

	@Override
	public EmployeeEntity saveEmp(EmployeeEntity employeeEntity) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			em.persist(employeeEntity);
			tx.commit();
			System.out.println("emp saved successfully");
		} catch (Exception e) {
			tx.rollback();
			System.out.println("emp not saved");
		}finally {
			em.close();
		}
		
		
		return employeeEntity;
	}

}
