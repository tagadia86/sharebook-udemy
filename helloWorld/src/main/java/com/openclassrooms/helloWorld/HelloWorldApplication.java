package com.openclassrooms.helloWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.openclassrooms.helloWorld.model.HelloWorld;
import com.openclassrooms.helloWorld.service.BusinessService;

@SpringBootApplication
public class HelloWorldApplication implements CommandLineRunner {
	
	@Autowired
	private BusinessService bs;

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		HelloWorld hw = bs.getHellWorld(); 
		System.out.println(hw.getValue()); 
	}

}
