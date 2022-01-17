package com.Reservation.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Reservation.Models.Reservation;

public interface ReservationRepo extends MongoRepository<Reservation, Long> {

}