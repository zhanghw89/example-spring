package com.springcloud.example.controller.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class SomeHystrixService {
	
	//springboot下使用ribbon需要注入RestTemplate
	@Autowired
	RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod="fallbackSome")//调用本方法失败时调用fallbackSome方法
	public String getSome() {
		return restTemplate.getForObject("http://some/getsome", String.class);
	}

	public String fallbackSome() {
		return "some Service 模块故障!";
	}
}
