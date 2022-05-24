package com.example.demo;

import com.example.demo.controller.MessageController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.core.AutoConfigureCache;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class DemosonarqubeApplicationTests {

 @Autowired
	private MessageController controller;
	@Test
	void contextLoads() {
	}

	@Test
	public void testGetMessage(){
			String message = controller.getMessage();
		Assertions.assertNotNull(message);
	}

}
