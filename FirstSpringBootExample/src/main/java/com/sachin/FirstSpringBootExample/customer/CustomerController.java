package com.sachin.FirstSpringBootExample.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/customers")
	@ResponseBody
	public Iterable<Customer> findAll(){
		Iterable<Customer> customers = customerService.findAll();
		return customers;
	}
}
