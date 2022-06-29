package dataAbstraction;

public abstract class Math {
	abstract public String findPositive(int a);
	 public String findPrime(int a) {
	boolean flag=true;
	for(int i=2;i<a;i++) {
		if(a%i==0) {
			flag=false;
		}
	}
	if(flag) {
		return a+" is a prime number";
	}
	else {
		return a+" is not a prime number";
	}
	
	}

}
