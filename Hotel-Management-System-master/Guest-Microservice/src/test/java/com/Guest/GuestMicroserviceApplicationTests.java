package com.Guest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.Guest.Models.Guest;
import com.Guest.Repository.GuestRepo;
import com.Guest.Service.Guestservice;

@RunWith(SpringRunner.class)
@SpringBootTest
class GuestMicroserviceApplicationTests {

	@Autowired
	Guestservice service;

	@MockBean
	private GuestRepo repo;

	@Test
	void contextLoads() {
	}

	@Test
	public void getGuestTest() {
		when(repo.findAll())
				.thenReturn(Stream
						.of(new Guest(1, "abc", 998877665, "abc@gmail.com", "Male", "us"),
								new Guest(1, "abc", 998877665, "abc@gmail.com", "Male", "us"))
						.collect(Collectors.toList()));
		assertEquals(2, service.getAllGuest().size());
	}

	
	
	  @Test public void addGuestTest() { Guest guest = new Guest(1, "abc",
	  998877665, "abc@gmail.com", "Male", "us");
	  when(repo.insert(guest)).thenReturn(guest); assertEquals(guest,
	  service.addGuest(guest)); }
	 
	 
	
	
	@Test
	public void updateGuestTest() {
	Guest guest = new Guest(1, "abc", 998877665, "abc@gmail.com", "Male", "us");
	when(repo.save(guest)).thenReturn(guest); 
	assertEquals(guest,service.updateGuest(guest));
	}
	
	
	
	/*
	 * @Test public void deleteGuestTest() { Guest guest=new Guest(1, "abc",
	 * 998877665, "abc@gmail.com", "Male", "us"); service.deleteGuest(guest);
	 * verify(repo,times(1)).delete(guest); }
	 */
	 
	 
	

}
