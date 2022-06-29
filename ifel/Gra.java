package ifel;

public class Gra {
	public static void main(String[] args) {
		int a=68;
		if(a<=100&&a>=90) {
			System.out.println("S Grade");
		}
		else if(a<=90&&a>=80) {
			System.out.println("A Grade");
		}
		else if(a<=80&&a>=70) {
			System.out.println("B Grade");
		}
		else if(a<=70&&a>=60) {
			System.out.println("C Grade");
		}
		else if(a<=60&&a>=40) {
			System.out.println("D Grade");
		}
		else if(a>0&&a<40) {
			System.out.println("Can do better");
		}
		else {
			System.out.println("Fail");
		}
	}
	}


