package com.ddf.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class DDFService {
	
	
public String tellHello(@RequestParam String name) {
		
		
	return "Hello DDF User" +name;
		
	}

}
