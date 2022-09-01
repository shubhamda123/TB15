package Junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Demo {
	
	@BeforeClass
	public static void m1()
	{
		System.out.println("m1--beforeClass");
	}
	
	@AfterClass
	public static void m2()
	{
		System.out.println("m2--AfterClass");
	}
	
	@Before
	public void m3()
	{
		System.out.println("m3--before");
	}
	
	@After
	public void m4()
	{
		System.out.println("m4--After");
	}
	
	@Test
	public void m5()
	{
		System.out.println("m5--Test");
	}
	
	@Test
	public void m6()
	{
		System.out.println("m6--Test");
	}
	
	@Test
	public void m7()
	{
		System.out.println("m7--Test");
	}
	
	

}
