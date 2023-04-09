package com.ddf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ddf.service.DDFService;

@RestController
public class DDFController {
	
	@Autowired
	DDFService ddfService;
	
	@GetMapping("/hello")
	public String tellHello(@RequestParam String name) {
		
		return ddfService.tellHello(name);
		
	}

}
