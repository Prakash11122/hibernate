package com.pradhan.mto.dao;

import com.pradhan.mto.entity.Loan;

public interface LoanDAO {
	
	void saveLoan(Loan loan);
	
	Loan fetchLoanDetailsById(Integer LoanId);
	
	void removeLoan(Integer loanId); 

}
