package com.paygate.apiTest.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface APIMapper {
	List<Map<String, Object>> getUserInfo();
}
