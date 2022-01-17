package com.Owner.Controller;

import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.Owner.Models.Department;
import com.Owner.Models.DepartmentList;

@RestController
@RequestMapping("/Owner/department")
public class OwnerDepartmentController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/hello")
	public String hello() {
		return "Welcome Owner";
	}

	@PostMapping("/add")
	public Department addDept(@RequestBody Department dept) {
		return restTemplate.postForObject("http://localhost:8085/department/add", dept, Department.class);

	}

	@GetMapping("/findAll")
	public DepartmentList getAlldept() {
		return restTemplate.getForObject("http://localhost:8085/department/findAll/", DepartmentList.class);
	}

	@GetMapping("/findById/{id}")
	public Department getEmp(@PathVariable("id") String id) {
		return restTemplate.getForObject("http://localhost:8085/department/findById/" + id, Department.class);

	}

	@PutMapping("/update")
	public Department updateRoom(@RequestBody Department dept) {
		restTemplate.put("http://localhost:8085/department/update", dept, Department.class);
		return dept;
	}

	@DeleteMapping("/delete/{id}")
	public String deleteDepartment(@PathVariable("id") String id) {
		restTemplate.delete("http://localhost:8085/department/delete/" + id);
		return "Deleted room " + id;
	}

}
