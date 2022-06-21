package com.teamb.Restfulwebservices3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class locationController {

	@Autowired
	locationResource countryService;
	
	@GetMapping ("/getcountries")//get all users
	public List getCountries()
	{
		countryService.getAllCountries();
		return countryService. getAllCountries();
	}
	
	@GetMapping("/getcountries/{id}")
	public location getlocationById(@PathVariable (value="id") int id)
	{
		 return countryService.getlocationbyID(id);
	}
}
