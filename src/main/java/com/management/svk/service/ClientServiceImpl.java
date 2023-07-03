package com.management.svk.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.websocket.Session;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.svk.model.HMISClient;
import com.management.svk.repository.ClientRepository;
import com.management.svk.request.ClientRequest;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	ClientRepository clientRepository;
	
	@Autowired
	EntityManager entityManager;
	
	

	@Override
	public void addClient(ClientRequest clientRequest) {

		HMISClient hmisClient = new HMISClient();
		BeanUtils.copyProperties(clientRequest, hmisClient);
		HMISClient save = clientRepository.save(hmisClient);

	}

	@Override
	public List<HMISClient> getAllClient() {

		List<HMISClient> findAll = clientRepository.findAll().stream().filter(i -> i.getDeleteFlag().equals("0"))
				.collect(Collectors.toList());
		if (findAll != null) {
			return findAll;
		}
		return null;
	}

	@Override
	public HMISClient editClient(HMISClient hmisClient) {

		HMISClient hmisClient2 = clientRepository.save(hmisClient);
		if (hmisClient2 != null) {
			return hmisClient2;
		} else {
			return null;
		}
//		return null;
	}

	@Override
	public String deleteClient(Integer clientId) {

		Optional<HMISClient> findById = clientRepository.findById(clientId);
		HMISClient hmisClient = findById.get();
		hmisClient.setDeleteFlag("1");
		clientRepository.save(hmisClient);
//		clientRepository.deleteById(clientId);
		if (findById.isPresent()) {
			return "client deleted successfully";
		} else {
			return "not found";
		}

	}

	@Override
	public HMISClient getClientById(Integer clientId) {
		Optional<HMISClient> findById = clientRepository.findById(clientId);
		if(findById.isPresent()) {
			return findById.get();
		}
		else
			return null;
	}

	@SuppressWarnings("deprecation")
	@Override
	public HMISClient searchHospitalByName(String hospitalName) {
		
		Criteria criteria = entityManager.unwrap(org.hibernate.Session.class).createCriteria(HMISClient.class);;
		criteria.add(Restrictions.eq("hospitalName", hospitalName));
		List<HMISClient> hmisClient =  criteria.list();
//		HMISClient findByHospitalName = clientRepository.findByHospitalName(hospitalName);
//        return query.getResultList();
		return hmisClient.get(0);
	}

}
