package com.teamb.Restfulwebservices;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String sayHi() {
		return "<h1> Hello World ! </h1>";
	}

}
