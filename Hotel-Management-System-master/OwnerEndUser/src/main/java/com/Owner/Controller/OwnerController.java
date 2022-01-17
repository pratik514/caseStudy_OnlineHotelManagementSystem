package com.Owner.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Owner.Models.OwnerInformation;
import com.Owner.Repository.OwnerRepository;
//import com.Owner.SecurityConfiguration.OwnerAuthResponse;
import com.Owner.Service.OwnerService;
import com.SecurityConfiguration.OwnerAuthResponse;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/Owner")
public class OwnerController {
	
	@GetMapping("/show")
	public String test() {
		return "Hello Owner";
	} 
	
	
	@Autowired
	private OwnerService ownerService;
	
	@Autowired
	private OwnerRepository ownerRepo;
	
	@Autowired
	private AuthenticationManager authenticationManager;

		
			// Adding data into OwnerInformation Collection
	@PostMapping("/addOwner")
	private ResponseEntity<?> saveOwnerInfo(@RequestBody OwnerInformation ownerInfo) {
		String email = ownerInfo.getEmail();
		String password = ownerInfo.getPassword();
		OwnerInformation owner1 = new OwnerInformation();
		owner1.setEmail(email);
		owner1.setPassword(password);
		try {

			ownerRepo.save(ownerInfo);
		} catch (Exception e) {
			return ResponseEntity.ok(new OwnerAuthResponse("Error creating Owner" + email));
		}
		return ResponseEntity.ok(new OwnerAuthResponse("Successfully created Owner " + email));
	}

	
	
	@PostMapping("/auth")
	private ResponseEntity<?> authOwner(@RequestBody OwnerInformation ownerInfo) {
		String email = ownerInfo.getEmail();
		String password = ownerInfo.getPassword();
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(email, password));
		} catch (Exception e) {
			return ResponseEntity.ok(new OwnerAuthResponse("Error during Owner Authentication" + email));
		}
		return ResponseEntity.ok(new OwnerAuthResponse("Successfully Authenticated Owner" + email));
	}

	
		//Used to get all of the Owner_Details
	@GetMapping("/owner")
	public List<OwnerInformation> findAllOwners() {
		return ownerService.getOwnerInfos();
	}

}

