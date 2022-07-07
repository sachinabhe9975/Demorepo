package com.customer_management.services;

import java.util.List;

import com.customer_management.entity.Customer;

public interface CustomerService 
{
	
	public List<Customer> findAll();

	public Customer findById(int theId);

	public void save(Customer thecustomer);

	public void deleteById(int theId);

}
