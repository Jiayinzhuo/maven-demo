package com.jsoft.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AddTest {

	@Test
	public void addTest() {
		App app = new App();
		int result = app.add(100, 200);
		assertEquals(300, result);
	}

}
