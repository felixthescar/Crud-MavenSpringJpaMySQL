package com.bank.bankofrupcy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bank.bankofrupcy.model.Account;
import com.bank.bankofrupcy.repository.AccountRepository;

@Component
public class AccountService {
	@Autowired
	private AccountRepository accRepo;

	public Account findById(Long id) {
		return accRepo.findById(id).get();
	}

	public List<Account> findAll() {
		return (List<Account>) accRepo.findAll();
	}

	public void deleteById(Long id) {
		accRepo.deleteById(id);
	}

	public void save(Long clId, Long empId, Long bal) {
		Account acc = new Account();
		acc.setClientId(clId);
		acc.setEmpId(empId);
		acc.setBalance(bal);
		accRepo.save(acc);
	}

	public void update(Long id, Long clId, Long empId, Long balance) {
		Account acc = new Account();
		acc.setId(id);
		acc.setClientId(clId);
		acc.setEmpId(empId);
		acc.setBalance(balance);
		accRepo.save(acc);
	}
}
