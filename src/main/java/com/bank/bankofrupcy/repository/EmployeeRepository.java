package com.bank.bankofrupcy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bank.bankofrupcy.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
