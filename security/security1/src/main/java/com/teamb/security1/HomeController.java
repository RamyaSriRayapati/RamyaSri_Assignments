package com.teamb.security1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
@RequestMapping("/admin")
public String home() {
	return "home.jsp";
}
}
