package com.bank.bankofrupcy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bank.bankofrupcy.model.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long>{

}
