package com.fabio.mvc.hotel.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/login")
public class LoginController {
	
	
	@RequestMapping(method=RequestMethod.GET)
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String login(HttpServletRequest request,HttpServletResponse response) {
		return "login";
	}
}
