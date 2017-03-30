package com.springcloud.example.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // 开启对EurekaServer的支持
public class SpringCloudExampleDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudExampleDiscoveryApplication.class, args);
	}
}
