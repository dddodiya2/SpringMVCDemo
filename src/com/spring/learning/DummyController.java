package com.spring.learning;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DummyController {

	@RequestMapping("/")
	public String homePage() {
		return "home";
	}

}
