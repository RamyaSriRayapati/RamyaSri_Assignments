package com.teamb.Restfulwebservices2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/validation")
public class ValidationController {
	
	
	@GetMapping
	public String getUsers(@RequestParam(value="username")String username,@RequestParam(value="password") String password)
	{
		if(username.equals("Ramya") && password.equals("ram"))
            return "Valid User";
       else
           return "Invalid User";
	 
	}

}
