package com.demo.WebService1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class WebService1ApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testDemo(){
		WebService1Application app = new WebService1Application();
		String s = app.demo();
		assertEquals(true,s.contains("Demo"));
	}
}
