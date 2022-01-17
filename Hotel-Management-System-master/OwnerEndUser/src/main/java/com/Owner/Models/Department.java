package com.Owner.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Department Details")
public class Department {
	
	@Id
	private long departmentID;
	private String departmentName;
	private String desc;
	private int No_of_Emp;
	public long getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(long departmentID) {
		this.departmentID = departmentID;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getNo_of_Emp() {
		return No_of_Emp;
	}
	public void setNo_of_Emp(int no_of_Emp) {
		No_of_Emp = no_of_Emp;
	}
	
	
	@Override
	public String toString() {
		return "Department [departmentID=" + departmentID + ", departmentName=" + departmentName + ", desc=" + desc
				+ ", No_of_Emp=" + No_of_Emp + "]";
	}
	
	
	public Department(long departmentID, String departmentName, String desc, int no_of_Emp) {
		super();
		this.departmentID = departmentID;
		this.departmentName = departmentName;
		this.desc = desc;
		No_of_Emp = no_of_Emp;
	}
	
	
	public Department() {
		
	}
	
	
	
	

}
