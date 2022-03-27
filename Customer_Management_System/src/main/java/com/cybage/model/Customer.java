package com.cybage.model;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.cybage.model.Address;

@Entity
@Table(name="customer_details")
public class Customer {
	@Id
	private int id;
	private String name;
	private String Email;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="customer")
	private List<Address>address;
	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public Customer(int id, String name, String email, List<Address> address) {
		super();
		this.id = id;
		this.name = name;
		Email = email;
		this.address = address;
	}
	
   public List<Address>getAdd(){
	   return  (List<Address>) address;
   }
	public Customer() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", Email=" + Email + "]";
	}
}
