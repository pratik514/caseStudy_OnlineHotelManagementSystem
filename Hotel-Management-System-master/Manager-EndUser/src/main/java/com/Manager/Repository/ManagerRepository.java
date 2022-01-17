package com.Manager.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Manager.Models.ManagerInformation;

public interface ManagerRepository extends MongoRepository<ManagerInformation, String> {

	ManagerInformation findByEmail(String email);

}
