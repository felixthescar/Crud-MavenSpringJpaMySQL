package com.bank.bankofrupcy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bank.bankofrupcy.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
}
