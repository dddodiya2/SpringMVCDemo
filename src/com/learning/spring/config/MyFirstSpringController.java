package com.learning.spring.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
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

	@RequestMapping("/showForm")
	public String showForm() {
		return "myForm";
	}

	@RequestMapping("/submitForm")
	public String submitForm(HttpServletRequest request, Model model) {
		String theName = request.getParameter("userName");
		
		model.addAttribute("mygivenName", theName);
		
		return "displayForm";
	}

}
