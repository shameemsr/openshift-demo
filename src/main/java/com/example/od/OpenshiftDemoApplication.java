package com.example.od;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OpenshiftDemoApplication {
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "Welcome to Openshift!!";
	}
	
	@RequestMapping("/{name}")
	public String greeting(@PathVariable String name) {
		return "Hello " + name + ". Welcome to Openshift!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(OpenshiftDemoApplication.class, args);
	}

}
