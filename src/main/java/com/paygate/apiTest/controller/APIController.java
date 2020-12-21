package com.paygate.apiTest.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paygate.apiTest.service.APIService;

@RestController
public class APIController {
	
	@Autowired
	APIService service;
	
	@GetMapping("/")
	public String home() {
		return "Hi, This is Spring boot First Page";
	}
	
	@GetMapping("/getUserInfo")
	public List<Map<String, Object>> getUserInfo() {
		return service.getUserInfo();
	}
}
