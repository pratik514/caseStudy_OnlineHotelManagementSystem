package com.Department.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Department.Model.Department;
import com.Department.Repository.DepartmentRepo;

@Service
public class DepartmentserviceImpl implements Departmentservice {

	// It is used for initializing an interface.
	@Autowired
	private DepartmentRepo repo;

	@Override
	public Department addDepartment(Department dept) {
		return repo.insert(dept);
	}

	@Override
	public String deleteDepartment(long id) {
		repo.deleteById(id);
		return "Department Deleted";
	}

	@Override
	public Department updateDepartment(Department dept) {
		return repo.save(dept);
	}

	// In order to avoid NullPointerException we use Optional<>.
	@Override
	public Optional<Department> getDepartment(long id) {
		return repo.findById(id);
	}

	@Override
	public List<Department> getAlldept() {
		return repo.findAll();
	}

}
