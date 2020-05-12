package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class ConfigController {
	
	@RequestMapping("/hello")
	public String configHello() {
		return "<h1 style='color:grey;'>Hello World For Config !!!</h1>";
	}
}
