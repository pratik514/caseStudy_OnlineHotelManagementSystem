package com.Receptionist.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
/*import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;*/
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Receptionist.Models.ReceptionistInformation;
import com.Receptionist.Repository.ReceptionistRepository;
/*import com.Receptionist.SecurityConfiguration.ReceptionistAuthResponse;
import com.Receptionist.Service.ReceptionistService;*/

@RestController
@RequestMapping("/Receptionist")
public class ReceptionistController {
	/*
	 * @Autowired private ReceptionistService receptionistService;
	 */
	@Autowired
	private ReceptionistRepository receptionistRepo;
//	@Autowired
	/*
	 * private AuthenticationManager authenticationManager;
	 */
	/*
	 * @PostMapping("/addReceptionist") private ResponseEntity<?>
	 * saveReceptionistInfo(@RequestBody ReceptionistInformation receptionistInfo) {
	 * String email = receptionistInfo.getEmail(); String password =
	 * receptionistInfo.getPassword(); ReceptionistInformation receptionist1 = new
	 * ReceptionistInformation(); receptionist1.setEmail(email);
	 * receptionist1.setPassword(password); try {
	 * 
	 * receptionistRepo.save(receptionistInfo); } catch (Exception e) { return
	 * ResponseEntity.ok(new ReceptionistAuthResponse("Error creating Receptionist"
	 * + email)); } return ResponseEntity.ok(new
	 * ReceptionistAuthResponse("Successfully created Receptionist " + email)); }
	 */

	/*@PostMapping("/auth")
	private ResponseEntity<?> authReceptionist(@RequestBody ReceptionistInformation receptionistInfo) {
		String email = receptionistInfo.getEmail();
		String password = receptionistInfo.getPassword();
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(email, password));
		} catch (Exception e) {
			return ResponseEntity.ok(new ReceptionistAuthResponse("Error during Receptionist Authentication" + email));
		}
		return ResponseEntity.ok(new ReceptionistAuthResponse("Successfully Authenticated Receptionist" + email));
	}

	@GetMapping("/receptionist")
	public List<ReceptionistInformation> findAllReceptionists() {
		return receptionistService.getReceptionistInfos();
	}
*/
}