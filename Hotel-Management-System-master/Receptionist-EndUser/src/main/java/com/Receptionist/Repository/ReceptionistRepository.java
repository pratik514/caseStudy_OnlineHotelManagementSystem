package com.Receptionist.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Receptionist.Models.ReceptionistInformation;

public interface ReceptionistRepository extends MongoRepository<ReceptionistInformation, String> {

	ReceptionistInformation findByEmail(String email);

}
