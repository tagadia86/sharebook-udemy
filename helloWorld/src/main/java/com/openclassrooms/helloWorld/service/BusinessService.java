package com.openclassrooms.helloWorld.service;

import org.springframework.stereotype.Component;

import com.openclassrooms.helloWorld.model.HelloWorld;

@Component
public class BusinessService {

	public HelloWorld getHellWorld(){
		HelloWorld hw = new HelloWorld();
		return hw;
	}
	
}
