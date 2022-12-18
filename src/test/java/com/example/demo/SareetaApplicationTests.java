package com.example.demo;

import com.example.demo.controllersTests.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ UserControllerTest.class, ItemControllerTest.class, CartControllerTest.class, OrderControllerTest.class })
@SpringBootTest
public class SareetaApplicationTests {

	@Test
	public void contextLoads() {
	}

}