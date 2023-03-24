package com.jenkinsexample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import ch.qos.logback.classic.Logger;

@SpringBootTest
class JenkinsDemoApplicationTests {
	public static Logger logger =(Logger) LoggerFactory.getLogger(JenkinsDemoApplicationTests.class);


	@Test
	void contextLoads() {
		logger.info("test case executing...");
		assertEquals(true, true);
	}

}
