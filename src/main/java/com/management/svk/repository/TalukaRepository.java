package com.management.svk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.svk.model.StateMaster;
import com.management.svk.model.TalukaMaster;

@Repository
public interface TalukaRepository extends JpaRepository<TalukaMaster, Integer> {

	public List<TalukaMaster> findAllBydistrictCode(Integer districtCode);
}
