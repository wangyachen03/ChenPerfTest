package com.chen.xia;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.chen.xia.mapper")
@SpringBootApplication
public class XiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(XiaApplication.class, args);
	}

}
