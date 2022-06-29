package junit1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class UsePrimPos {
	PrimPos p=new PrimPos();
	@Before 
	public void firsttest() {
		System.out.println("Operation");
	}
	@Test 
	public void testCase() {
		p.prime();
	}
	@Test 
	public void firsttestCase() {
		p.pos();
	}
	@After
	public void afterCase() {
		System.out.println("Result");
	}
	

}
