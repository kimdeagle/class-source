package com.test.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ex06Controller {

	@RequestMapping(value="ex06.action")
	public String ex06() {
		
		return "ex06";
	}
	
	@RequestMapping(value="ex06ok.action")
	public String ex06ok() {
		
		return "ex06ok";
	}
	
}
