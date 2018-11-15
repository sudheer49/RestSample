package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {
	
	@GetMapping("/welcome/user")
	@ResponseBody
	public String welcomeUser(@RequestParam(name="name",required = false , defaultValue = "Satya Sudheer") String name)
	{
		return "Hello! <b>"+name+"</b> Welcome to Spring RestAPI";
	}

}
