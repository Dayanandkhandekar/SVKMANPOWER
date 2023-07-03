package com.management.svk.service;

import java.util.List;

import com.management.svk.model.HMISClient;
import com.management.svk.request.ClientRequest;

public interface ClientService {

	public void addClient(ClientRequest clientRequest);

	public List<HMISClient> getAllClient();
	
	public HMISClient getClientById(Integer clientId);

	public HMISClient editClient(HMISClient hmisClient);

	public String deleteClient(Integer clientId);
	
	public HMISClient searchHospitalByName(String name);
}
