package dataAbstraction;

public class Math1 extends Math {
	public String findPositive(int a) {
		if(a>0) {
			return a+" is positive";
			
		}
		else {
			return a+" is negative";
		}
	}

}
