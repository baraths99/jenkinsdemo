package com.fiserv.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // application to application communication
public class WelcomeController {
	 
	@RequestMapping(value="/hello")
	public String sayHello()
	{
		return " welcome to spring rest application";
	}

}
