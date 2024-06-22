package com.example.test_ci_cd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TestCiCdApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestCiCdApplication.class, args);
	}
	@GetMapping
	public String hello(){
		return "hello-v1";
	}
}
