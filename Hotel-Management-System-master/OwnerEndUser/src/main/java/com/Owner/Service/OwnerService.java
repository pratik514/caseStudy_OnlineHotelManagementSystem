package com.Owner.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.Owner.Models.OwnerInformation;
import com.Owner.Repository.OwnerRepository;
import com.SecurityConfiguration.OwnerAuthResponse;

@Service
public class OwnerService implements UserDetailsService {

	@Autowired
	private OwnerRepository ownerRepo;

	
	public List<OwnerInformation> getOwnerInfos() {
		List<OwnerInformation> ownerInfos = ownerRepo.findAll();
		System.out.println("Getting Owner from DB" + ownerInfos);
		return ownerInfos;
	}
	//check if the OwnerInformation is null or not 
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		OwnerInformation foundedOwner = ownerRepo.findByEmail(username);
		if (foundedOwner == null)
			return null;
		String Email = foundedOwner.getEmail();
		String Password = foundedOwner.getPassword();
		return new User(Email, Password, new ArrayList<>());
	}

}