package com.spring.user.model;

public class ResponseDto {
    private Employee employee;
    
    
    public ResponseDto( ) {}

	public ResponseDto(Employee employee) {
		this.employee = employee;

	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	

	
	
	


}