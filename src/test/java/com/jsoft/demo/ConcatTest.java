package com.jsoft.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;

public class ConcatTest {

	@Test
	public void test() {
		App app = new App();
		String result = app.concat("Hello ", "World!");
		assertEquals("Hello World!", result);
	}

	private ArrayList<String> list;

	@Test
	public void m5() {
		list = new ArrayList<String>();
		list.clear();
		list.add("test");
		assertFalse(list.isEmpty());
		assertEquals(1, list.size());
	}

	@Ignore
	public void m6() {
		System.out.println("Using @Ignore , this execution is ignored");
	}

	@Test(timeout = 10)
	public void m7() {
		System.out.println("Using @Test(timeout),it can be used to enforce timeout in JUnit4 test case");
	}

	@Ignore
	@Test(expected = NoSuchMethodException.class)
	public void m8() {
		System.out.println("Using @Test(expected) ,it will check for specified exception during its execution");

	}
}
