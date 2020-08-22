package com.sasi.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EurekaServerRegistryApplication {
 
	public static void main(String[] args) {
		System.out.println("hello");
		SpringApplication.run(EurekaServerRegistryApplication.class, args);
	}

}
