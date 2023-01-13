package com.bank.bankofrupcy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bank.bankofrupcy.model.Employee;
import com.bank.bankofrupcy.repository.EmployeeRepository;

@Component
public class EmployeeService {
	@Autowired
	private EmployeeRepository empRepo;
	
	public Employee findById(Long id) {
		return empRepo.findById(id).get();
	}
	
	public List<Employee> findAll() {
		return (List<Employee>) empRepo.findAll();
	}
	
	public void deleteById(Long id) {
		empRepo.deleteById(id);
	}
	
	public void save(String name, String surname, String npc, String phoneNr, String salary) {
		Employee emp = new Employee();
		emp.setName(name);
		emp.setSurname(surname);
		emp.setNpc(npc);
		emp.setPhoneNr(phoneNr);
		emp.setSalary(salary);
		empRepo.save(emp);
	}
	
	public void update(Long id, String name, String surname, String npc, String phoneNr, String salary) {
		Employee emp = new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setSurname(surname);
		emp.setNpc(npc);
		emp.setPhoneNr(phoneNr);
		emp.setSalary(salary);
		empRepo.save(emp);
	}
}
