package com.java.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HTMLController {
	@RequestMapping("/index")
	public String thymeleaf() {
		
		return "index";
	}
}
