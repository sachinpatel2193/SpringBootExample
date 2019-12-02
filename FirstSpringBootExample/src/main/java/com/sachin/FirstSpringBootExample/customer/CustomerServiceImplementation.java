package com.sachin.FirstSpringBootExample.customer;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImplementation implements CustomerService {
	@Autowired
	private CustomerRepository customerRepository;
	public Iterable<Customer> findAll() {
		return customerRepository.findAll();
	}
//	public Long createCustomer(Customer customer) {
//		Customer newCustomer = new Customer();
//		newCustomer.setId(123);
//		newCustomer.setFirstName(customer.getFirstName());
//		newCustomer.setLastName(customer.getLastName());
//		newCustomer.setAddress(customer.getAddress());
//		return customerRepository.save(newCustomer).getId();
//	}
//	public Customer updateCustomer(Long id, CustomerUpdateDAO customerUpdateDAO) {
//		
//		return null;
//	}
}
