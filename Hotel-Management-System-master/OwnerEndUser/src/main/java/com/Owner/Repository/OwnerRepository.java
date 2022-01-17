package com.Owner.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Owner.Models.OwnerInformation;

public interface OwnerRepository extends MongoRepository<OwnerInformation , String> {
	
	OwnerInformation findByEmail(String email);

}