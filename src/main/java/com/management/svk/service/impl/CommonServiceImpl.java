package com.management.svk.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.svk.model.DistrictMaster;
import com.management.svk.model.StateMaster;
import com.management.svk.model.TalukaMaster;
import com.management.svk.model.VillageMaster;
import com.management.svk.repository.DistrictRepository;
import com.management.svk.repository.StateRepository;
import com.management.svk.repository.TalukaRepository;
import com.management.svk.repository.VillageRepository;
import com.management.svk.service.CommonService;

@Service
public class CommonServiceImpl implements CommonService {

	@Autowired
	StateRepository stateRepo;
	
	@Autowired
	DistrictRepository districtRepository;
	
	@Autowired
	TalukaRepository talukaRepository;
	
	@Autowired
	VillageRepository villageRepository;
	
	
	@Override
	public List<StateMaster> getAllState() {
		
		List<StateMaster> findAll = stateRepo.findAll();
		if(findAll.isEmpty())
			return null;
		else
			return findAll;
	}

	@Override
	public List<DistrictMaster> getAllDistrict(Integer stateId) {
		// TODO Auto-generated method stub
		List<DistrictMaster> findAllBystateId = districtRepository.findAllBystateId(stateId);
		if(findAllBystateId.isEmpty())
			return null;
		else
			return findAllBystateId;
		//return null;
	}

	@Override
	public List<TalukaMaster> getAllTaluka(Integer districtCode) {

		List<TalukaMaster> talukaMasters = talukaRepository.findAllBydistrictCode(districtCode);
		if(talukaMasters.isEmpty())
			return null;
		else
			return talukaMasters;
		}

	@Override
	public List<VillageMaster> getAllVillage(Integer talukaCode) {
		
		List<VillageMaster> villageMasters = villageRepository.findAllBysubDistrictCode(talukaCode);
		if(villageMasters.isEmpty())
			return null;
		else
			return villageMasters;
	}

	
	
}
