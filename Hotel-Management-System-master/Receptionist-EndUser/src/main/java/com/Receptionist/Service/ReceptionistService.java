/*
 * package com.Receptionist.Service;
 * 
 * import java.util.ArrayList; import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.security.core.userdetails.User; import
 * org.springframework.security.core.userdetails.UserDetails; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.core.userdetails.UsernameNotFoundException;
 * import org.springframework.stereotype.Service;
 * 
 * import com.Receptionist.Models.ReceptionistInformation; import
 * com.Receptionist.Repository.ReceptionistRepository;
 * 
 * @Service public class ReceptionistService implements UserDetailsService {
 * 
 * @Autowired private ReceptionistRepository receptionistRepo;
 * 
 * public List<ReceptionistInformation> getReceptionistInfos() {
 * List<ReceptionistInformation> receptionistInfos = receptionistRepo.findAll();
 * System.out.println("Getting Receptionist from DB" + receptionistInfos);
 * return receptionistInfos; }
 * 
 * @Override public UserDetails loadUserByUsername(String username) throws
 * UsernameNotFoundException { ReceptionistInformation foundedReceptionist =
 * receptionistRepo.findByEmail(username); if (foundedReceptionist == null)
 * return null; String Email = foundedReceptionist.getEmail(); String Password =
 * foundedReceptionist.getPassword(); return new User(Email, Password, new
 * ArrayList<>()); }
 * 
 * }
 */