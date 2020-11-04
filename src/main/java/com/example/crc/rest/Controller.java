package com.example.crc.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.crc.entity.BillingOfferMaster;
import com.example.crc.repo.BillingOfferMasterRepo;

@RestController
public class Controller {

	@Autowired
	private BillingOfferMasterRepo repo;

	@GetMapping("/show")
	public String getMessage(@RequestParam String message) {
		return "Message: ".concat(message);
	}

	@GetMapping("/billing")
	public BillingOfferMaster getBilling(@RequestParam String id) {

		Optional<BillingOfferMaster> bom = repo.findById(id);

		if (bom.isPresent()) {
			return bom.get();
		}
		
		return new BillingOfferMaster();
	}

}
