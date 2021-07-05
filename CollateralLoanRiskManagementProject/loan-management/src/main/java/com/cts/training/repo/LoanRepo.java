package com.cts.training.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.training.model.Loan;

/**
 * Loan Entity Crud Repository
 */
@Repository
public interface LoanRepo extends CrudRepository<Loan, Integer> {

}
