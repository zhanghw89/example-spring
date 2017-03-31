package com.springcloud.example.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class SpringCloudExampleServiceApplication {

	@Value("$my.message")
	private String message;
	
	@RequestMapping(value="/getsome",method=RequestMethod.GET)
	public String getsome(){
		return message;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudExampleServiceApplication.class, args);
	}
}
