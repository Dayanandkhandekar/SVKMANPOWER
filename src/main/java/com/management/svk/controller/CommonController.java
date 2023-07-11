package com.management.svk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.management.svk.model.DistrictMaster;
import com.management.svk.model.StateMaster;
import com.management.svk.model.TalukaMaster;
import com.management.svk.model.VillageMaster;
import com.management.svk.service.CommonService;

@CrossOrigin(origins = "*", maxAge = 3600)
//@CrossOrigin(origins = "http://localhost:7070")
@RestController
@RequestMapping("/common")
public class CommonController {

	@Autowired
	CommonService commonService;
	
	@GetMapping("/getAllState")
	public List<StateMaster> getAllState(){
		
		List<StateMaster> allState = commonService.getAllState();
		return allState;
		
		
	}
	
	@GetMapping("/getAllDistrict")
	public List<DistrictMaster> getAllDistrict(@RequestParam("stateId") Integer stateId ){
		
		List<DistrictMaster> allDistrict = commonService.getAllDistrict(stateId);
		return allDistrict;
		
		
	}
	
	@GetMapping("/getAllTaluka")
	public List<TalukaMaster> getAllTaluka(@RequestParam("districtCode") Integer districtCode ){
		
		List<TalukaMaster> allTaluka = commonService.getAllTaluka(districtCode);
		return allTaluka;
		
		
	}
	
	@GetMapping("/getAllVillage")
	public List<VillageMaster> getAllVillage(@RequestParam("talukaCode") Integer districtCode ){
		
		List<VillageMaster> allTaluka = commonService.getAllVillage(districtCode);
		return allTaluka;
		
		
	}
}
