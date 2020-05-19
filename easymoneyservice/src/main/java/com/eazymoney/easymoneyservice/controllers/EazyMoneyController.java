package com.eazymoney.easymoneyservice.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EazyMoneyController {

	@CrossOrigin(origins = "*")
	@GetMapping(value = "/hello")
	public String hello()
	{
		return "Hello! Welcome to EazyMoney!!";
	}
	
}
