package ifel;

public class DiB {
	public static void main(String[] args) {
		int num=9;
		if(num%2==0&&num%3==0) {
			System.out.println(num+" is divisible by both");
		}
		else if(num%2==0) {
			System.out.println(num+" is divisible by 2");
		}
		else if(num%3==0) {
			System.out.println(num+" is divisible by 3");
		}
		else {
			System.out.println(num+" is not divisible by both");
		}
	}
	}


