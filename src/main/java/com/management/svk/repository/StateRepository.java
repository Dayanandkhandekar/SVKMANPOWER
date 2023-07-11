package com.management.svk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.svk.model.Role;
import com.management.svk.model.StateMaster;

@Repository
public interface StateRepository extends JpaRepository<StateMaster, Integer>   {

	
	
}
