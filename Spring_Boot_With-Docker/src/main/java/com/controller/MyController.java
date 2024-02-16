package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {
	
	@GetMapping(value ="/")
	public String sayhello() {
		return "welcome to spring boot with docker image";
	}

}
