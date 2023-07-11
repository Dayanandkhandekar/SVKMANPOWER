package com.management.svk.service;

import java.util.List;

import com.management.svk.model.DistrictMaster;
import com.management.svk.model.StateMaster;
import com.management.svk.model.TalukaMaster;
import com.management.svk.model.VillageMaster;

public interface CommonService {

	public List<StateMaster> getAllState();
	
	public List<DistrictMaster> getAllDistrict(Integer stateId);
	
	public List<TalukaMaster> getAllTaluka(Integer districtCode);
	
	public List<VillageMaster> getAllVillage(Integer talukaCode);
 }
