package com.teamb.security2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/admin")
    public String adminPage(){
        return "Hello World Admin";
    }
}
