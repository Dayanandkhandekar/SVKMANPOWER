package com.management.svk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.svk.model.VillageMaster;

@Repository
public interface VillageRepository extends JpaRepository<VillageMaster, Integer> {

	public List<VillageMaster> findAllBysubDistrictCode(Integer subDistrictCode);
}
