package com.fabio.mvc.hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/home")
public class HomeController {
	
	@RequestMapping(method= {RequestMethod.GET,RequestMethod.POST})
	public String index() {
		System.out.println("********ECCOCI********");
		return "home";
	}
}
