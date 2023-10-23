package com.example.mypack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkninsIntegrationApplicationTests {
	
	public static Logger logger = LoggerFactory.getLogger(JenkninsIntegrationApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("<------------Stared excution of Junit test method----------------->");
		assertEquals(true, true);
		logger.info("<------------ended excution of Junit test method----------------->");
	}
	

}
