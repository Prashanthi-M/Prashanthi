package junit1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UseStr {
	Str s=new Str("Java","Run","Functions");
		
	@Before 
	public void firsttest() {
		System.out.println("Running");
		
	}
	@Test
	public void testCase() {
		System.out.println(s.length().toUpperCase());
	}
	@Test
	public void Equals() {
	
		assertEquals(s.StrString,"FUNCTONS");
		System.out.println("Same");
	
	}
		 
		
		
	
	@After
	public void afterCase() {
		System.out.println("Result");
		
	}

}
