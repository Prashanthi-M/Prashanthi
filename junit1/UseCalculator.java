package junit1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UseCalculator {
	Calculator cal=new Calculator();
	@Before 
	public void firsttest() {
		System.out.println("Running");
	}
	@Test
	public void testCase() {
		cal.Addition();
		
	}
	@Test 
	public void secondtestCase() {
		cal.Sub();
	}
	@Test
	public void thirdtestCase() {
		cal.Multi();
		
	}
	@Test 
	public void fourthtestCase() {
		cal.Division();
	}
    @After
    public void afterCase() {
    	System.out.println("Result");
    }
}
