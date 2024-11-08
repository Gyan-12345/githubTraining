package com.example.demo.springBootDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@Autowired
	HomeService homeService;

	@GetMapping("/springBootDemo")
	public String hello() {
		System.out.println("This is my indexpage");

		return "index";

	}

}
