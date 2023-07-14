package com.spring.user.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.spring.user.model.Employee;
import com.spring.user.model.ResponseDto;
import com.spring.user.repository.EmployeeRepository;

@Service
public class EmployeeService 
{
	@Autowired
	public EmployeeRepository employeeRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	public EmployeeService(EmployeeRepository employeeRepository) 
	{

		this.employeeRepository = employeeRepository;
	}
	
	

	public ResponseDto getEmployee(int userId)
	{
		    ResponseDto responseDto = new ResponseDto();
	        ResponseEntity<Employee> responseEntity = restTemplate
	                .getForEntity("http://192.168.60.22:8085/api/employees/" + userId,Employee.class);
            
	        Employee emp = responseEntity.getBody();

	        System.out.println(responseEntity.getStatusCode());

	        
	        responseDto.setEmployee(emp);

	        return responseDto;
	}
	
	
	
	/*public Employee saveEmployee(Employee employee) 
	{
		  ResponseDto responseDto = new ResponseDto();
	        ResponseEntity<Employee> responseEntity = restTemplate
	                .getForEntity("http://192.168.60.22:8085/api/employees",Employee.class);
	        Employee employees = responseEntity.getBody();
		   
        return employeeRepository.save(employees);
	}*/
	
	/*public void sendDataToApi(String apiUrl, Object data)
	{
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        String url = "http://192.168.60.22:8085/api/employees";
        HttpEntity<Object> requestEntity = new HttpEntity<>(data, headers);
        
        ResponseEntity<Object> responseEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity, Object.class);
        
        // Handle the response as needed
        if (responseEntity.getStatusCode().is2xxSuccessful())
        {
            // Request was successful
            // ... handle the response data
        } else {
            // Request failed
            // ... handle the error
        }*/
	
	
	
}





















