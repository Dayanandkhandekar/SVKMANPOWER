package com.management.svk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.management.svk.model.HMISClient;
import com.management.svk.request.ClientRequest;
import com.management.svk.service.ClientService;

@CrossOrigin(origins = "*", maxAge = 3600)
//@CrossOrigin(origins = "http://localhost:7070")
@RestController
@RequestMapping("/client")
public class ClientController {

	@Autowired
	ClientService clientService;

	@PostMapping("/add")
	public String addClient(@RequestBody ClientRequest clientRequest) {

		clientService.addClient(clientRequest);
		return "Success";
	}
	
	@GetMapping("/getClientById")
	public HMISClient addClient(@RequestParam("id") Integer clientId) {

		HMISClient clientById = clientService.getClientById(clientId);
		return clientById;
	}

	@GetMapping("/getAllClient")
	public List<HMISClient> getAllClient() {

		List<HMISClient> allClient = clientService.getAllClient();
		return allClient;
	}

	@PutMapping("/edit")
	public HMISClient editClient(@RequestBody HMISClient hmisClient) {

		HMISClient editClient = clientService.editClient(hmisClient);
		return editClient;
	}

	@DeleteMapping("/delete/{clientId}")
	public String deleteClient(@PathVariable Integer clientId) {

		String deleteClient = clientService.deleteClient(clientId);
		return deleteClient;
	}
	
	@GetMapping("/searchHospitalByName")
	public HMISClient searchHospitalByName(@RequestParam String hospitalName) {

		HMISClient searchHospitalByName = clientService.searchHospitalByName(hospitalName);
		return searchHospitalByName;
	}
}
