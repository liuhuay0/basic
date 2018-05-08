package com.basic.basiceurekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuhuayo
 * @date 2018-05-08
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class BasicEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicEurekaClientApplication.class, args);
	}

	@Value("${server.port}")
	String port;

	@RequestMapping("/")
	public String index(){
		return "欢迎使用eureka的客户端,来自端口" + this.port;
	}
}
