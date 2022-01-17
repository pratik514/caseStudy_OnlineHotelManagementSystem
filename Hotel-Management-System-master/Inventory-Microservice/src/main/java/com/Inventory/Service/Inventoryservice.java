package com.Inventory.Service;

import java.util.List;
import java.util.Optional;

import com.Inventory.Models.Inventory;

public interface Inventoryservice {

	Inventory addInventory(Inventory inv);

	Optional<Inventory> getInventory(long parseLong);

	Inventory updateInventory(Inventory inv);

	String deleteInventory(long parseLong);

	List<Inventory> getAllInventory();

}