package com.Inventory.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Inventory.Models.Inventory;
import com.Inventory.Repository.InventoryRepo;


@Service
public class InventoryserviceImpl implements Inventoryservice {
	
	@Autowired
	InventoryRepo inventoryRepo;

	@Override
	public Inventory addInventory(Inventory inv) {
		return inventoryRepo.insert(inv);
	}

	@Override
	public List<Inventory> getAllInventory() {
		return inventoryRepo.findAll();
	}

	@Override
	public Optional<Inventory> getInventory(long parseLong) {
		return inventoryRepo.findById( parseLong);
	}

	@Override
	public Inventory updateInventory(Inventory inv) {
		return inventoryRepo.save(inv);
	}

	@Override
	public String deleteInventory(long parseLong) {
		inventoryRepo.deleteById(parseLong);
		return "Deleted employee with ID :" + parseLong;
	}

	
}