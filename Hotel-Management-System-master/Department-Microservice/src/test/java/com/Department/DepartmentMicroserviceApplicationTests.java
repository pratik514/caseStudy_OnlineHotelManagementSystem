package com.Department;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.Department.Model.Department;
import com.Department.Repository.DepartmentRepo;
import com.Department.Service.Departmentservice;

@RunWith(SpringRunner.class)
@SpringBootTest
class DepartmentMicroserviceApplicationTests {

	@Autowired
	Departmentservice service;

	@MockBean
	private DepartmentRepo repo;

	@Test
	void contextLoads() {
	}

	@Test
	public void getDepartmentTest() {
		when(repo.findAll())
				.thenReturn((List<Department>) Stream
						.of(new Department(1, "Cooking", "Cooking Decsription", 10),
								new Department(2, "Cleaning", "Cleaning Decsription", 12))
						.collect(Collectors.toList()));
		assertEquals(2, service.getAlldept().size());
	}

	@Test
	public void addDeptTest() {
		Department dept = new Department(2, "laundry", "laundry Decsription", 11);
		when(repo.insert(dept)).thenReturn(dept);
		assertEquals(dept, service.addDepartment(dept));
	}

	@Test
	public void updateDeptTest() {
		Department dept = new Department(1, "Cooking", "Cooking Decsription", 10);
		when(repo.save(dept)).thenReturn(dept);
		assertEquals(dept, service.updateDepartment(dept));
	}

}
