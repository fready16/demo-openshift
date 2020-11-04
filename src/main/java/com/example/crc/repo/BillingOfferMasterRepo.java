package com.example.crc.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crc.entity.BillingOfferMaster;

@Repository
public interface BillingOfferMasterRepo extends JpaRepository<BillingOfferMaster, String> {
	
	public Optional<BillingOfferMaster> findById(String id);

}
