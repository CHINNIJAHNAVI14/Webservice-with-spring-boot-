package com.spring.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.user.model.Employee;


	@Repository
	public interface EmployeeRepository extends JpaRepository<Employee, Integer>
	{
		
	 
	}
