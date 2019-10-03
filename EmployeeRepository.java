package com.luv2code.angularrestapidemo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.luv2code.angularrestapidemo.model.Employee;



public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	Employee findByName(String name);
}
