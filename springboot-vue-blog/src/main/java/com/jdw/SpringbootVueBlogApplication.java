package com.jdw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jdw.mapper")
public class SpringbootVueBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootVueBlogApplication.class, args);
	}

}
