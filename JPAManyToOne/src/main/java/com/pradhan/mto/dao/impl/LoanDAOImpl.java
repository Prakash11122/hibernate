package com.pradhan.mto.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.pradhan.mto.dao.LoanDAO;
import com.pradhan.mto.entity.Loan;

public class LoanDAOImpl implements LoanDAO {
	
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

	@Override
	public void saveLoan(Loan loan) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			em.persist(loan);
			tx.commit();
			System.out.println("Loan onject is persisted successfully");
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}finally {
			em.close();
		}

	}

	@Override
	public Loan fetchLoanDetailsById(Integer LoanId) {
		EntityManager em = factory.createEntityManager();
		 Loan loan = em.find(Loan.class, LoanId);
		 em.close();
		 
		
		return loan;
	}

	@Override
	public void removeLoan(Loan loanId) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			Loan loan = em.find(Loan.class, loanId);
			em.remove(loan);
			tx.commit();
			System.out.println("loan object is deleted");
		} catch (Exception ex) {
			tx.rollback();
			ex.printStackTrace();
		}finally {
			em.close(); 
		}
		

	}

}
