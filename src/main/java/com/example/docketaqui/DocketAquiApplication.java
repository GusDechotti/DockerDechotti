package com.example.docketaqui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DocketAquiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocketAquiApplication.class, args);
		System.out.println("Hello world!");
	}

}
