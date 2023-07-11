package com.management.svk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.svk.model.DistrictMaster;

public interface DistrictRepository extends JpaRepository<DistrictMaster, Integer> {

	public List<DistrictMaster>  findAllBystateId(Integer stateId);
}
