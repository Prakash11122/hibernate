package com.pradhan.otm.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.pradhan.otm.dao.CategoryDao;
import com.pradhan.otm.entity.CategoryEntity;

public class CategoryDAOImpl implements CategoryDao {
	
	private EntityManagerFactory factoty = Persistence.createEntityManagerFactory("test");

	@Override
	public void saveCategory(CategoryEntity categoryEntity) {
		EntityManager em = factoty.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		try {
			em.persist(categoryEntity);
			tx.commit();
			System.out.println("category with product are persist into db");
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}finally {
			em.close();
		}

	}

	@Override
	public CategoryEntity fetchCategory(Integer categoryId) {
		EntityManager em = factoty.createEntityManager();
		CategoryEntity categoryEntity = em.find(CategoryEntity.class, categoryId);
		em.close();
		return categoryEntity;
	}

	@Override
	public void removeCategory(Integer categoryId) {
		EntityManager em = factoty.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		CategoryEntity categoryEntity = em.find(CategoryEntity.class, categoryId);
		tx.begin();
		try {
			em.remove(categoryEntity);
			tx.commit();
			System.out.println("category with product is removed from db");
		} catch (Exception e) {
			tx.rollback();
			e.fillInStackTrace();
		}finally {
			em.close();
		}
		

	}

}
