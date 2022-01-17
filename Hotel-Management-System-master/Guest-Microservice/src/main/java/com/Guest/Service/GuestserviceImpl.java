package com.Guest.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Guest.Models.Guest;
import com.Guest.Repository.GuestRepo;

@Service
public class GuestserviceImpl implements Guestservice {

	@Autowired
	GuestRepo guestRepo;

	@Override
	public Guest addGuest(Guest guest) {
		return guestRepo.insert(guest);
	}

	@Override
	public Guest updateGuest(Guest guest) {
		return guestRepo.save(guest);
	}

	@Override
	public String deleteGuest(int id) {
		guestRepo.deleteById(id);
		return "Deleted Guest Id: " + id;
	}

	@Override
	public Optional<Guest> getGuest(int id) {
		return guestRepo.findById(id);
	}

	@Override
	public List<Guest> getAllGuest() {
		return guestRepo.findAll();
	}

}
