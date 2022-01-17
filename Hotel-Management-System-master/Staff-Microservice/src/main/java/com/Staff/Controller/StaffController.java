package com.Staff.Controller;

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

import com.Staff.Models.Staff;
import com.Staff.Models.StaffList;
import com.Staff.Service.Staffservice;

@RestController
@RequestMapping("/Staff")
public class StaffController {

	@Autowired
	Staffservice staffService;

	@PostMapping("/addEmp")
	public Staff addEmployee(@RequestBody Staff emp) {
		return this.staffService.addEmp(emp);
	}

	@GetMapping("/getAllEmp")
	public StaffList getAllEmployee() {
		StaffList list = new StaffList();
		list.setAllEmp(this.staffService.getAllEmp());
		return list;
	}

	@GetMapping("/getByEmp/{id}")
	public Optional<Staff> getEmployee(@PathVariable("id") String id) {
		return this.staffService.getEmp(Long.parseLong(id));
	}

	@PutMapping("/updateEmp")
	public Staff updateEmployee(@RequestBody Staff emp) {
		return this.staffService.updateEmp(emp);
	}

	@DeleteMapping("/deleteByEmp/{id}")
	public String deleteEmployee(@PathVariable("id") String id) {
		return this.staffService.deleteEmp(Long.parseLong(id));
	}

}