package com.opendecision.decision;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@MapperScan(basePackages = "com.opendecision.decision.mapper")
@SpringBootApplication
@EnableConfigServer
public class DecisionManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(DecisionManagementApplication.class, args);
	}
}
