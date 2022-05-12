package com.spring.learning;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class MyFirstSpringController {

	@RequestMapping("/welcome")
	public String welcomePage() {
		System.out.println("welcomePage method called");
		return "main-menu";		
	}
	
	@RequestMapping("/bye")
	public String byePage() {
		System.out.println("byePage method called");
		return "main-menu1";		
	}
	
}
