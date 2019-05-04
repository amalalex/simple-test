package com.some.prog.suites;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTestLC {
	
	@BeforeClass
	public static void init() {
		
		System.out.println("init() ");
	}
	
	@Before
	public void prepare() {
		
		System.out.println("prepare() ");
	}
	
	@Test
	public void loginTest0() {
		System.out.println("loginTest0() ");	
	}
	
	@Test
	public void loginTest1() {
		
		System.out.println("loginTest1() ");
		
	}
	
	@Test
	public void loginTest2() {
		
		System.out.println("loginTest2() ");
		
	}
	
	
	@After
	public void cleanup() {
		
		System.out.println("cleanup() ");
		
	}
	
	@AfterClass
	public static void quit() {
		
		System.out.println("quit() ");
		
	}

}
