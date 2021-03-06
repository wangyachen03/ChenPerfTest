package com.chen.xia;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@MapperScan("com.chen.xia.mapper")
@SpringBootApplication
@EnableScheduling
public class XiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(XiaApplication.class, args);
	}

}
