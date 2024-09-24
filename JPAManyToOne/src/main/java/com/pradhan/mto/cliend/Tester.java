package com.pradhan.mto.cliend;

import com.pradhan.mto.dao.LoanDAO;
import com.pradhan.mto.dao.impl.LoanDAOImpl;
import com.pradhan.mto.entity.Customer;
import com.pradhan.mto.entity.Loan;

public class Tester {

	public static void main(String[] args) {
		
		LoanDAO ld = new LoanDAOImpl();
		/*
		 saveloan()
		 */
		Loan ploan = new Loan();
		ploan.setLoanId(112211);
		ploan.setLoanType("personal Loan");
		ploan.setAmount(4333.0);
		
		Loan vloan = new Loan();
		vloan.setLoanId(112211);
		vloan.setLoanType("vehicle loan");
		vloan.setAmount(10008009.0 );
		
		Loan hloan = new Loan();
		hloan.setLoanId(5443345);
		hloan.setLoanType("home loan");
		hloan.setAmount(221002000.0);
		
		Customer cst = new Customer();
		cst.setCustomerId(100);
		cst.setCustomerName("A");
		
		ploan.setCustomer(cst);
		vloan.setCustomer(cst);
		hloan.setCustomer(cst); 

	}

}
