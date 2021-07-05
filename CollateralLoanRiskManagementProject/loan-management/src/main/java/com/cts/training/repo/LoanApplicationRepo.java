package com.cts.training.repo;

import org.springframework.data.repository.CrudRepository;

import com.cts.training.model.LoanApplication;

/**
 * Loan Application Crud Repository
 */
public interface LoanApplicationRepo extends CrudRepository<LoanApplication, Integer> {

}
