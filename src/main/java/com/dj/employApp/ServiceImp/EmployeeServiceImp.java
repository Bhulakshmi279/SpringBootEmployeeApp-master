package com.dj.employApp.ServiceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dj.employApp.Service.EmployeeService;
import com.dj.employApp.model.Employee;
import com.dj.employApp.repo.EmployeeRepo;

@Service
public class EmployeeServiceImp implements EmployeeService{
	
	@Autowired
	private EmployeeRepo repo;
	
	public Integer saveEmployee(Employee emp) {
		emp = repo.save(emp);
		return emp.getId();
	}

	public void updateEmployee(Employee emp) {
		repo.save(emp);
	}

	public void deleteEmployee(Integer id) {
		repo.deleteById(id);
	}

	public Employee getEmployeeById(Integer id) {
		Optional<Employee> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

	public List<Employee> getAll() {
		return repo.findAll();
	}

}
