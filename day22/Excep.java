package day22;

public class Excep {
	public static void main(String[] args) {
		
	try {
	int a=10;
	int b=0;
	int c=a/b;
	System.out.println(c);
	}catch(ArithmeticException d) {
		//d.printStackTrace();
		System.out.println("Don't divide by zero");
	}
	System.out.println("java");
}
}