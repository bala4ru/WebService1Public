package com.demo.WebService1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebService1Application {

	public static void main(String[] args) {
		SpringApplication.run(WebService1Application.class, args);
	}

	@RequestMapping(value="demo")
	public String demo(){
		//dummy update
		//TO DO
		return "Demo Welcomes you...............";
	}
}
