package com.bank.bankofrupcy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bank.bankofrupcy.model.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long>{

}
