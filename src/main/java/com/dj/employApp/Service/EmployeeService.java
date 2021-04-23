package com.dj.employApp.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.dj.employApp.model.Employee;

public interface EmployeeService {
	Integer saveEmployee(Employee s);

	void updateEmployee(Employee s);

	void deleteEmployee(Integer id);

	Employee getEmployeeById(Integer id);

	List<Employee> getAll();
}
