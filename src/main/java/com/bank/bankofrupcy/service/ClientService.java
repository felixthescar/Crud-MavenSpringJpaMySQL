package com.bank.bankofrupcy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bank.bankofrupcy.model.Client;
import com.bank.bankofrupcy.repository.ClientRepository;

@Component
public class ClientService {
	@Autowired
	private ClientRepository clientRepo;
	
	public Client findById(Long id) {
		return clientRepo.findById(id).get();
	}
	
	public List<Client> findAll() {
		return (List<Client>) clientRepo.findAll();
	}
	
	public void deleteById(Long id) {
		clientRepo.deleteById(id);
	}
	
	public void save(String name, String surname, String npc, String phoneNr) {
		Client client = new Client();
		client.setName(name);
		client.setSurname(surname);
		client.setNpc(npc);
		client.setPhoneNr(phoneNr);
		clientRepo.save(client);
	}
	
	public void update(Long id, String name, String surname, String npc, String phoneNr) {
		Client client = new Client();
		client.setId(id);
		client.setName(name);
		client.setSurname(surname);
		client.setNpc(npc);
		client.setPhoneNr(phoneNr);
		clientRepo.save(client);
	}
}
