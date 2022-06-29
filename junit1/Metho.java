package junit1;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Metho {
	String a="Java";
	String b="Java";
	String c="java";
	String d=null;
	public void True() {
	assertEquals(a,b);
	a.equals(b);
	}
	public void False() {
	assertNotEquals(a,c);
	a.equals(c);
    }
	public void not() {
		assertNull(d);
	}
	public void notN() {
		assertNotNull(a);
	}
	public void Same() {
		assertSame(a,b);
	}
	public void NotSame() {
		assertNotSame(a,c);
	}
	
	@Before 
	public void firsttest() {
		System.out.println("Running");
	}
	@Test
	public void testCase() {
		True();
		System.out.println("True");
	}
	@Test
	public void firsttestCase() {
		False();
		System.out.println("False");
		
	}
	@Test
	public void sectestCase() {
		not();
		System.out.println("Null");
	}
	@Test 
	public void thirdtestCase() {
		notN();
		System.out.println("NotNull");
	}
	@Test
	public void fourtestCase() {
		Same();
		System.out.println("Same");
	}
	@Test
	public void fifthtestCase() {
		NotSame();
		System.out.println("NotSame");
	}
 
	@After
	public void afterCase() {
		System.out.println("Result");
	}
	
	
	
	
	
	

}
