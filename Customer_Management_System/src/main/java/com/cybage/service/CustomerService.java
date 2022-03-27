package com.cybage.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.model.Customer;
import com.cybage.Repository.CustomerRepository;


@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepo;

	public void addCustomer(Customer customer) {
		customerRepo.save(customer);
		
	}

	public List<Customer> getAll() {
		
		return customerRepo.findAll();
	}

	public Customer getById(int id) {
		
		return customerRepo.findById(id).get();
	}

	public void deleteById(int id) {
		customerRepo.deleteById(id);
		
	}

	public Customer updateById(int id, Customer customer) {
		
		return customerRepo.save(customer);
	}

}
