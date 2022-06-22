package com.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import junit.framework.Assert;

public class Employee {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	@Before
	public void before() {
		System.out.println("Start Time");
	}
	@Test
	public void test1() {
		System.out.println("Logic 1");
	}
//	@Ignore
	@Test
	public void test2() {
		System.out.println("Logic 200");
		Assert.assertTrue(false);
		System.out.println("Logic 2");
	}
	@Test
	public void test3() {
		System.out.println("Logic 3");
	}
	@After
	public void afterMethod() {
		System.out.println("End Time");
	}
	@AfterClass
	public static void afterC() {
        System.out.println("After Class");
	}
}
