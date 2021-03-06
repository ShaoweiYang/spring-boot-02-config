package com.atguigu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@Controller
//@RestController
public class HelloController {
	
	@Value("${person.lastName}")
	private String name;
	
	@RequestMapping("/sayHello")
	public String sayHello() {
		return "Hello, " + name;
	}
}
