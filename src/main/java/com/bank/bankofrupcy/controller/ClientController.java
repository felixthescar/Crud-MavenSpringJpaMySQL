package com.bank.bankofrupcy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bank.bankofrupcy.model.Client;
import com.bank.bankofrupcy.service.ClientService;

@Controller
public class ClientController {
	@Autowired
	private ClientService clientService;

	@PostMapping("editBtnClt")
	public String editFctClt(ModelMap model, @RequestParam("cltIdToEdit") Long id,
			@RequestParam("cltNameToEdit") String name, @RequestParam("cltSurnameToEdit") String surname,
			@RequestParam("cltNpcToEdit") String npc, @RequestParam("cltPhoneNrToEdit") String phoneNr) {
		clientService.update(id, name, surname, npc, phoneNr);
		List<Client> clients = clientService.findAll();
		model.put("clients", clients);
		return "clienti";
	}

	@PostMapping("addBtnClt")
	public String addFctClt(ModelMap model, @RequestParam("cltNameToAdd") String name,
			@RequestParam("cltSurnameToAdd") String surname, @RequestParam("cltNpcToAdd") String npc,
			@RequestParam("cltPhoneNrToAdd") String phoneNr) {
		clientService.save(name, surname, npc, phoneNr);
		List<Client> clients = clientService.findAll();
		model.put("clients", clients);
		return "clienti";
	}

	@PostMapping("deleteBtnClt")
	public String delFctClt(ModelMap model, @RequestParam("recordToDelete") Long id) {
		System.out.println(id);
		clientService.deleteById(id);
		List<Client> clients = clientService.findAll();
		model.put("clients", clients);
		return "clienti";
	}
}
