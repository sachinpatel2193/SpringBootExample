package com.sachin.FirstSpringBootExample.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoCustomerCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	private CustomerRepository customerRepository;

	public void run(String... args) throws Exception {
		
		Customer mehul = new Customer();
		mehul.setId(1);
		mehul.setFirstName("Mayur");
		mehul.setLastName("Patel");
		mehul.setAddress("111, Ahmedabad");
		
		customerRepository.save(mehul);
		
		Customer keyur = new Customer();
		keyur.setId(2);
		keyur.setFirstName("Keyur");
		keyur.setLastName("Patel");
		keyur.setAddress("22, Ahmedabad");
		
		customerRepository.save(keyur);
	}

}
