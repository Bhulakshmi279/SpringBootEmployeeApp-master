package com.dj.employApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dj.employApp.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
