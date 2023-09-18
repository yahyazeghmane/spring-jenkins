package com.snim.jenkins2;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Jenkins2ApplicationTests {
	private static Logger logger = LoggerFactory.getLogger(Jenkins2ApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("Test case executing...");
		Assert.assertEquals(1+1, 2);
	}

}
