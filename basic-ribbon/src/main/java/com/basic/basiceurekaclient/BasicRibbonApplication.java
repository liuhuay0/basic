package com.basic.basiceurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author liuhuayo
 * @date 2018-05-08
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class BasicRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicRibbonApplication.class, args);
	}

	@RequestMapping("/")
	public String index(){
		return "欢迎使用eureka的客户端";
	}

	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
