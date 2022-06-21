package com.teamb.Restfulwebservices9;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> getAllCustomer(){
		List<Customer> cust = new ArrayList<>();
		customerRepository.findAll().forEach(cust::add);
		return cust;
	}
	
	public void addCustomer(Customer cust) {
		customerRepository.save(cust);
	}
	
	public Optional<Customer> getCustomer(String id){
		return customerRepository.findById(id);
	}
	
	public void updateCustomer(Customer cust) {
		customerRepository.save(cust);
	}
	
	public void deleteCustomer(String id) {
		customerRepository.deleteById(id);
	}
}