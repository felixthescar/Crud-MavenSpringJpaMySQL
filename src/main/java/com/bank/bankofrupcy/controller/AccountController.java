package com.bank.bankofrupcy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bank.bankofrupcy.model.Account;
import com.bank.bankofrupcy.service.AccountService;

@Controller
public class AccountController {

	@Autowired
	private AccountService accService;
	
	@PostMapping("editBtnAcc")
	public String editFctAcc(ModelMap model, 
			@RequestParam("idToEdit") Long id,
			@RequestParam("clIdToEdit") Long clId,
			@RequestParam("empIdToEdit") Long empId,
			@RequestParam("balanceToEdit") Long bal) {
		accService.update(id, clId, empId, bal);
		List<Account> accounts = accService.findAll();
		model.put("accounts", accounts);
		return "conturi";
	}
	
	@PostMapping("addBtnAcc")
	public String addFctAcc(ModelMap model, 
			@RequestParam("clIdToAdd") Long clId,
			@RequestParam("empIdToAdd") Long empId,
			@RequestParam("balanceToAdd") Long bal) {
		accService.save(clId, empId, bal);
		List<Account> accounts = accService.findAll();
		model.put("accounts", accounts);
		return "conturi";
	}
	
	@PostMapping("deleteBtnAcc")
	public String delFctAcc(ModelMap model, @RequestParam("recordToDelete") Long id) {
		accService.deleteById(id);
		List<Account> accounts = accService.findAll();
		
		model.put("accounts", accounts);
		return "conturi";
	}
}
