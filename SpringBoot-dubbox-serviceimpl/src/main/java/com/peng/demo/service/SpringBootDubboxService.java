package com.peng.demo.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.peng.demo.mapper"})
public class SpringBootDubboxService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SpringBootDubboxService.class, args);

	}

}
