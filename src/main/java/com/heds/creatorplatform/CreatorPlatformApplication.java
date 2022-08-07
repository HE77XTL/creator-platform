package com.heds.creatorplatform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.heds.creatorplatform.mapper")
public class CreatorPlatformApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreatorPlatformApplication.class, args);
	}

}
