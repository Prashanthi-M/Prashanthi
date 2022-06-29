package ifel;

public class ElGrr {
	public static void main(String[] args) {
		int age=-12;
		if(age>0 && age<=12) {
			System.out.println("Child");
		}
		else if(age>=12&&age<=19) {
			System.out.println("TeenAge");
		}
		else if(age>=20&&age<=60) {
			System.out.println("Adult");
		}
		else if(age>=60) {
			System.out.println("Old");
		}
		else {
			System.out.println("None of the above");
		}
	}
	}


