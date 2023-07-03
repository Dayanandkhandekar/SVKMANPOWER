package com.management.svk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.svk.model.HMISClient;

public interface ClientRepository extends JpaRepository<HMISClient, Integer> {

}
