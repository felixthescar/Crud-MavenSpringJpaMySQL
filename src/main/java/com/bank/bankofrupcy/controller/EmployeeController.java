package com.bank.bankofrupcy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bank.bankofrupcy.model.Employee;
import com.bank.bankofrupcy.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService empService;

	@PostMapping("editBtnEmp")
	public String editFctEmp(ModelMap model,
	@RequestParam("empIdToEdit") Long id,
	@RequestParam("empNameToEdit") String name,
	@RequestParam("empSurnameToEdit") String surname,
	@RequestParam("empNpcToEdit") String npc,
	@RequestParam("empPhoneNrToEdit") String phoneNr,
	@RequestParam("empSalaryToEdit") String salary
	) {
		empService.update(id, name, surname, npc, phoneNr, salary);
		List<Employee> emps = empService.findAll();
		model.put("employees", emps);
		return "angajati";
	}
	
	@PostMapping("addBtnEmp") 
	public String addFctEmp(ModelMap model,
	@RequestParam("empNameToAdd") String name,
	@RequestParam("empSurnameToAdd") String surname,
	@RequestParam("empNpcToAdd") String npc,
	@RequestParam("empPhoneNrToAdd") String phoneNr,
	@RequestParam("empSalaryToAdd") String salary) {
		empService.save(name, surname, npc, phoneNr, salary);
		List<Employee> emps = empService.findAll();
		model.put("employees", emps);
		return "angajati";
	}
	
	@PostMapping("deleteBtnEmp")
	public String delFctEmp(ModelMap model, @RequestParam("recordToDelete") Long id) {
		empService.deleteById(id);
		List<Employee> emps = empService.findAll();
		model.put("employees", emps);
		return "angajati";
	}
}
