package com.java.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String sayHi() {
		try {
			int i = 10 / 10;
		} catch (Exception e) {
			// TODO: handle exception
		} finally {

		}
		return "Hi";
	}
	

}
