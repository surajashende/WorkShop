package com.cybage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.Exception.customerNotFound;
import com.cybage.model.Customer;
import com.cybage.service.CustomerService;


@RestController
public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/addCustomer")
	public ResponseEntity<String> addProduct(@RequestBody Customer customer)
	{
		customerService.addCustomer(customer);
		return new ResponseEntity<String>("Customer Added Successfully",HttpStatus.CREATED);	
	}
	
	@GetMapping("/getAll")
	public List<Customer> getAll()
	{
		return customerService.getAll();
	}
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<Customer> getById(@PathVariable int id) throws customerNotFound
	{
		Customer customer=customerService.getById(id);
		if(customer==null)
		{
			throw new customerNotFound("Customer Not Found");
		}
		return new ResponseEntity<Customer>(customer,HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteById/{id}")
	public ResponseEntity<String> deleteById(@PathVariable int id)
	{
		customerService.deleteById(id);
		return new ResponseEntity<String>("delete Customer sucessfully",HttpStatus.OK);
	}
	
	@PutMapping("/updateById/{id}")
	public ResponseEntity<String> updateById(@PathVariable int id, @RequestBody Customer customer)
	{
		Customer customer1=customerService.updateById(id,customer);
		return new ResponseEntity<String>("Update product sucessfully",HttpStatus.OK);
	}

}
