package com.caveofprogramming.spring.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loginController {
	
	@RequestMapping("/login")
	public String showLogin() {
		return "login";
	}
}
