package com.openclassrooms.helloWorld;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.openclassrooms.helloWorld.service.BusinessService;

@SpringBootTest
class HelloWorldApplicationTests {

	@Autowired
	private BusinessService bs;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void testGetHelloWorld() {
		String expected = "Hello World!";
		
		String result = bs.getHellWorld().getValue();
		
		assertEquals(expected, result);
		
	}
	
}
