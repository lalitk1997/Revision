package io.project.JUnit;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertTrue;
@SpringBootTest
class JUnitApplicationTests {
	@Test
	void demoTestMethod(){
		assertTrue(true);
	}
	@Test
	void contextLoads() {
	}

}
