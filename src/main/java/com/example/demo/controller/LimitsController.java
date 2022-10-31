package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.configuration.configuration;
import com.example.demo.controller.Limits.Limits;

@RestController
public class LimitsController {
	
	@Autowired
	private configuration config;
	
	@GetMapping("/limits")
	public Limits retriveLimits() {
		return new Limits(config.getMinimum(),config.getMaximum());
	}
}
