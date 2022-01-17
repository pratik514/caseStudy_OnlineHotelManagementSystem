package com.Inventory;

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

import com.Inventory.Models.Inventory;
import com.Inventory.Repository.InventoryRepo;
import com.Inventory.Service.Inventoryservice;

@RunWith(SpringRunner.class)
@SpringBootTest
class InventoryMicroserviceApplicationTests {

	@Autowired
	Inventoryservice service;
	
	@MockBean
	InventoryRepo repo;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void getInventoryTest() {
		when(repo.findAll())
				.thenReturn(Stream
						.of(new Inventory(76567l,"inv",67567l,"type"),
							new Inventory(76567l,"inv",67567l,"type"))
						.collect(Collectors.toList()));
		assertEquals(2, service.getAllInventory().size());
	}
	
	@Test
	public void addInventoryTest() {
		
	}

}
