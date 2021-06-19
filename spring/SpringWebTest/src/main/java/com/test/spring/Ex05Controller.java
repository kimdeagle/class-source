package com.test.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/ex05.action")
public class Ex05Controller {

	@RequestMapping
	public String ex05() {
		
		return "ex05";
	}
	
}
