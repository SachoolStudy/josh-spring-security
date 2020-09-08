package com.example.secu.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

	
	@GetMapping("/loginPage")
	public String login() {
		return "loginPage";
	}

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
	
	@PostMapping("/loginProcess")
	public void loginProcess() {
		System.out.println("로그인");
	}

}
