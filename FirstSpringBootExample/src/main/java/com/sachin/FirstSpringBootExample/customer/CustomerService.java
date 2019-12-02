package com.sachin.FirstSpringBootExample.customer;

import java.util.UUID;

public interface CustomerService {
	
	//public Long createCustomer(Customer customer);
	public Iterable<Customer> findAll();
	//public Customer updateCustomer(Long id, CustomerUpdateDAO customerUpdateDAO);
}
