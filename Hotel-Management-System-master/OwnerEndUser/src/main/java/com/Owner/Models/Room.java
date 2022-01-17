package com.Owner.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Rooms")
public class Room {

	@Id
	private Long roomId;
	private int roomCharges;
	private String roomType;
	private String roomDesc;
	private Boolean roomAvl;

	public Room() {

	}

	public Room(Long roomId, int roomCharges, String roomType, String roomDesc, Boolean roomAvl) {
		super();
		this.roomId = roomId;
		this.roomCharges = roomCharges;
		this.roomType = roomType;
		this.roomDesc = roomDesc;
		this.roomAvl = roomAvl;
	}

	public Long getRoomId() {
		return roomId;
	}

	public void setRoomId(Long roomId) {
		this.roomId = roomId;
	}

	public int getRoomCharges() {
		return roomCharges;
	}

	public void setRoomCharges(int roomCharges) {
		this.roomCharges = roomCharges;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public String getRoomDesc() {
		return roomDesc;
	}

	public void setRoomDesc(String roomDesc) {
		this.roomDesc = roomDesc;
	}

	public Boolean getRoomAvl() {
		return roomAvl;
	}

	public void setRoomAvl(Boolean roomAvl) {
		this.roomAvl = roomAvl;
	}

	@Override
	public String toString() {
		return "Room [roomId=" + roomId + ", roomCharges=" + roomCharges + ", roomType=" + roomType + ", roomDesc="
				+ roomDesc + ", roomAvl=" + roomAvl + "]";
	}

}
