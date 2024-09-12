package com.pradhan.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.pradhan.dao.ProductDao;
import com.pradhan.entity.ProductEntity;

public class ProductDaoImpl implements ProductDao{
	
	private EntityManagerFactory factory;
	public ProductDaoImpl() {
		factory = Persistence.createEntityManagerFactory("SUNADR");
	}

	@Override
	public ProductEntity saveProduct(ProductEntity product) {
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		try {
			entityManager.persist(product);
			tx.commit();
			System.out.println("Product is inserted to the database");
		} catch (Exception ex) {
			tx.rollback();
			System.out.println("Product is not inserted to the database");
		}finally {
			entityManager.close();
		}
		return product;
	}

	@Override
	public ProductEntity loadProductById(Integer productId) {
		EntityManager entityManager = factory.createEntityManager();
		/*
		 * find()->early loading
		 * getReference() ->lazy load
		 */
		
		ProductEntity p = entityManager.find(ProductEntity.class, productId);
		entityManager.close();
		return p;
	}

	@Override
	public ProductEntity updateProductById(Integer productId, Double new_unit_unitPrice) {
		EntityManager entityManager = factory.createEntityManager();
		ProductEntity p = entityManager.find(ProductEntity.class, productId);
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		try {
			p.setUnitPrice(new_unit_unitPrice);
			tx.commit();
			System.out.println("updated successfuly....");
		} catch (Exception ex) {
			tx.rollback();
			System.out.println("not updated");
		}finally {
			entityManager.close();
		}
		
		
		return p;
	}

	@Override
	public void deleteProductById(Integer productId) {
		EntityManager entityManager = factory.createEntityManager();
		ProductEntity p = entityManager.find(ProductEntity.class, productId);
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.remove(p);
		tx.commit();
		entityManager.close();
		
	}

	@Override
	public void testEntityState() {
		EntityManager entityManager = factory.createEntityManager();
		
		/*
		 * create a new product object
		  */
		ProductEntity pe = new ProductEntity(); //transient state
		pe.setProductName("bags");
		pe.setProductId(111222);
		pe.setQuantity(10);
		pe.setUnitPrice(10000.0);
		
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.persist(pe); //persistent state
		tx.commit();
		
		entityManager.detach(pe); //detached state
		pe.setUnitPrice(110000.0);//the change made to an entity
		entityManager.close(); //in detached state does't effect
		
		
	}

}
