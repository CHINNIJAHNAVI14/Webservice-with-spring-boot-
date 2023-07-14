package com.spring.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EntityScan("com.spring.user.model")
public class UserApplication {

	public static void main(String[] args) 
	{
		SpringApplication.run(UserApplication.class, args);
	}
	
	
	@Bean
	public RestTemplate getRestTemplate() 
	{
	      return new RestTemplate();
	}
	  
	  

}
