package junit1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Sample {
	@Before
	public void firstTest() {
		System.out.println("Welcome to Junit");
	}
	@Test
	public void testCase() {
		System.out.println("This is our First test");
	}
	@After
	public void afterCase() {
		System.out.println("Thank You");
	}
	
	
	

}
