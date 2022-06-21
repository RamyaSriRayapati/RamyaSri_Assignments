package com.teamb.Restfulwebservices9;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	@RequestMapping("/cust")
	public List<Customer> getAllCustomer(){
		return customerService.getAllCustomer();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/cust")
	public void addTopic(@RequestBody Customer cust) {
		customerService.addCustomer(cust);
	}
	
	@RequestMapping("/cust/{id}")
	public Optional<Customer> getCustomer(@PathVariable String id){
		return customerService.getCustomer(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/cust/{id}")
	public void updateCustomer(@RequestBody Customer cust, @PathVariable int id) {
		customerService.updateCustomer(cust);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/cust/{id}")
	public void deleteCustomer(@PathVariable String id) {
		customerService.deleteCustomer(id);
	}
}
