package com.cafe24.springex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan("com.cafe24.springex.controller")
// 이 하나의 어노테이션이 위 세 개의 어노테이션 역할을 전부 합친 것이다.
@SpringBootApplication
public class BootApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootApplication.class, args);
	}

}
