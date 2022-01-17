package com.Reservation.Services;

import java.util.List;
import java.util.Optional;

import com.Reservation.Models.Reservation;

public interface ReservationService {

	String addReservation(Reservation book);

	Reservation updateReservation(Reservation book);

	String deleteReservation(long parseLong);

	List<Reservation> getResList();

	Optional<Reservation> getReservation(long parseLong);
}