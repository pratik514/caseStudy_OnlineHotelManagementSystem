package com.Inventory.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Inventory")
public class Inventory {
	
	@Id
	private Long inventoryId;
	private String inventoryName;
	private Long inventoryStock;
	private String invetoryType;

	
	
	public Inventory() {
		super();
	}

	public Inventory(Long inventoryId, String inventoryName, Long inventoryStock, String invetoryType) {
		super();
		this.inventoryId = inventoryId;
		this.inventoryName = inventoryName;
		this.inventoryStock = inventoryStock;
		this.invetoryType = invetoryType;
	}

	
	public Long getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(Long inventoryId) {
		this.inventoryId = inventoryId;
	}

	public String getInventoryName() {
		return inventoryName;
	}

	public void setInventoryName(String inventoryName) {
		this.inventoryName = inventoryName;
	}

	public Long getInventoryStock() {
		return inventoryStock;
	}

	public void setInventoryStock(Long inventoryStock) {
		this.inventoryStock = inventoryStock;
	}

	public String getInvetoryType() {
		return invetoryType;
	}

	public void setInvetoryType(String invetoryType) {
		this.invetoryType = invetoryType;
	}

	@Override
	public String toString() {
		return "Inventory [inventoryId=" + inventoryId + ", inventoryName=" + inventoryName + ", inventoryStock="
				+ inventoryStock + ", invetoryType=" + invetoryType + "]";
	}

}
