package com.pradhan.dao.Impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.pradhan.dao.EmpDAO;
import com.pradhan.entity.EmployeeEntity;

public class EmpDaoImpl implements EmpDAO {
	
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

	@Override
	public List<EmployeeEntity> executeNamedQuery(int deptno) {
		 EntityManager em = factory.createEntityManager();
		 TypedQuery<EmployeeEntity> tq = em.createNamedQuery("query1", EmployeeEntity.class);
		 tq.setParameter(1, deptno);
		 List<EmployeeEntity> lst = tq.getResultList();
		 em.close();
		 
		return lst;
	}

	@Override
	public List executeNamedNativeQuery(int sal) {
		 EntityManager em = factory.createEntityManager();
		 Query q = em.createNamedQuery("query2");
		 q.setParameter(1, sal);
		 List lst = q.getResultList();
		 em.close();
		return lst;
	}

}
