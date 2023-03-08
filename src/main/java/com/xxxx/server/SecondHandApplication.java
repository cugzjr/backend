package com.xxxx.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class SecondHandApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondHandApplication.class, args);
	}

}
