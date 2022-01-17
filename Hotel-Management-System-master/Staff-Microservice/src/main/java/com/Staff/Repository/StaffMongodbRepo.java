package com.Staff.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Staff.Models.Staff;

public interface StaffMongodbRepo extends MongoRepository<Staff, Long> {

}
