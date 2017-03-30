package com.springcloud.example.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableConfigServer  //开启配置服务器支持
@EnableEurekaClient //开启作为Eureka的客户端支持
public class SpringCloudExampleConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudExampleConfigserverApplication.class, args);
	}
}
