package com.spring.user.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.user.model.*;
import com.spring.user.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("{id}")
    public ResponseEntity<ResponseDto> getEmployee(@PathVariable("id") int userId)
	{
        ResponseDto responseDto = employeeService.getEmployee(userId);
        return ResponseEntity.ok(responseDto);
    }
	

	
	/*@PostMapping
	public ResponseEntity<Employee> save(@RequestBody Employee employee)   
	{
        Employee savedEmployee = employeeService.saveEmployee(employee);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }*/
	 /*@PostMapping
	    public ResponseEntity<String> sendData(@RequestBody Object data) {
		 String url = "http://192.168.60.22:8085/api/employees";
	        employeeService.sendDataToApi(url, data);
	        
	        // Return a response to the client
	        return new ResponseEntity<>("Data sent to API successfully", HttpStatus.OK);
	    }*/


}










