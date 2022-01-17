package com.Inventory.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Inventory.Models.Inventory;
import com.Inventory.Models.InventoryList;
import com.Inventory.Service.Inventoryservice;

@RestController
@RequestMapping("/Inventory")
public class InventoryController {

	@Autowired
	Inventoryservice inventoryService;

	@PostMapping("/addInv")
	public Inventory addInventary(@RequestBody Inventory inv) {
		return this.inventoryService.addInventory(inv);
	}

	@GetMapping("/getAllInv")
	public InventoryList getAllInventory() {
		InventoryList list = new InventoryList();
		list.setAllstaff(this.inventoryService.getAllInventory());
		return list;
	}

	@GetMapping("/getByInv/{id}")
	public Optional<Inventory> getInventory(@PathVariable("id") String id) {
		return this.inventoryService.getInventory(Long.parseLong(id));
	}

	@PutMapping("/updateInv")
	public Inventory updateInventory(@RequestBody Inventory inv) {
		return this.inventoryService.updateInventory(inv);
	}

	@DeleteMapping("/deleteByInv/{id}")
	public String deleteInventory(@PathVariable("id") String id) {
		return this.inventoryService.deleteInventory(Long.parseLong(id));
	}
}
