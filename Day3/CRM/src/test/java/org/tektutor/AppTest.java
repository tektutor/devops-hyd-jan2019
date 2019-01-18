package org.tektutor;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

	@Test
	public void testSayHello() {

		App app = new App();

		String expectedResult = "Hello Java!";
		String actualResult   = app.sayHello();

		assertEquals ( expectedResult, actualResult );

	}

}
