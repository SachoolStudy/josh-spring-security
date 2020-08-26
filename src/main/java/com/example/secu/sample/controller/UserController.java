package com.example.secu.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	
//	@GetMapping("/login")
//	public String login() {
//		return "loginPage";
//	}

	@GetMapping("/loginSuccess")
	public String loginSuccess() {
		return "success";
	}

	@GetMapping("/accessDenied_page")
	public String accessDenied() {
		return "accessDenied_page";
	}
	
	@GetMapping("/logout")
	public String logout() {
		return "logout";
	}	

}
