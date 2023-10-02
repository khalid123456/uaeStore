package cases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class2 {
	
	@Test(priority = 1)
	public void method1() {
		
		String threadName = Thread.currentThread().getName();
		long threadId = Thread.currentThread().getId();
		System.out.println("Class2.method1" + "\t" + threadName + "\t" + threadId);
	}
	
	@Test(priority = 2)
	public void method2() {
		
		String threadName = Thread.currentThread().getName();
		long threadId = Thread.currentThread().getId();
		System.out.println("Class2.method2" + "\t" + threadName + "\t" + threadId);
	}
	
	@Test(priority = 3)
	public void method3() {
		
		String threadName = Thread.currentThread().getName();
		long threadId = Thread.currentThread().getId();
		System.out.println("Class2.method3" + "\t" + threadName + "\t" + threadId);
	}
	
	@Test(priority = 4)
	public void method4() {
		
		String threadName = Thread.currentThread().getName();
		long threadId = Thread.currentThread().getId();
		System.out.println("Class2.method4" + "\t" + threadName + "\t" + threadId);
	}
	
	@Test(priority = 5)
	public void method5() {
		
		String threadName = Thread.currentThread().getName();
		long threadId = Thread.currentThread().getId();
		System.out.println("Class2.method5" + "\t" + threadName + "\t" + threadId);
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Class2 beforeSuite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("Class2 afterSuite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Class2 beforeTest");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("Class2 afterTest");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Class2 beforeClass");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("Class2 afterClass");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Class2 beforeMethod");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Class2 afterMethod");
	}

}
