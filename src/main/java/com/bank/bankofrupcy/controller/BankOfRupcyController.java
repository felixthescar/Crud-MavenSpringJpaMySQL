package com.bank.bankofrupcy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bank.bankofrupcy.model.Account;
import com.bank.bankofrupcy.model.Client;
import com.bank.bankofrupcy.model.Employee;
import com.bank.bankofrupcy.model.User;
import com.bank.bankofrupcy.service.AccountService;
import com.bank.bankofrupcy.service.ClientService;
import com.bank.bankofrupcy.service.EmployeeService;
import com.bank.bankofrupcy.service.UserService;

@Controller
public class BankOfRupcyController {
	@Autowired
	private UserService userService;
	@Autowired
	private ClientService clientService;
	@Autowired
	private EmployeeService empService;
	@Autowired
	private AccountService accService;

	@GetMapping("/")
	public String lgp() {
		return "login";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String welcomePage(ModelMap model, @RequestParam("loginId") String username,
			@RequestParam("password") String password) {
		User user = userService.findUserByUsername(username);
		if (user == null) {
			model.put("errMsg", "Ohoo, mai usor hackere");
			return "login";
		}
		if (user.getPassword().equals(password)) {
			model.put("username", username);
			return "main";
		}
		model.put("errMsg", "Ohoo, mai usor hackere");
		return "login";
	}

	@PostMapping("ClientsPage")
	public String goToClienti(ModelMap model) {

		model.put("username", "ClientsPage");
		List<Client> clients = clientService.findAll();
		model.put("clients", clients);
		return "clienti";
	}

	@PostMapping("EmployeesPage")
	public String goToEmplyees(ModelMap model) {
		List<Employee> emp = empService.findAll();
		model.put("employees", emp);
		model.put("username", "EmployeesPage");
		return "angajati";
	}

	@PostMapping("AccountsPage")
	public String goToConturi(ModelMap model) {
		List<Account> accounts = accService.findAll();
		model.put("accounts", accounts);
		model.put("username", "AccountsPage");
		return "conturi";
	}
}
