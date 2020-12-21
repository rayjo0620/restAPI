package com.paygate.apiTest.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paygate.apiTest.mapper.APIMapper;

@Service
public class APIService {
	@Autowired
	private APIMapper mapper;
	
	public List<Map<String, Object>> getUserInfo() {
		return mapper.getUserInfo();
	}
}
