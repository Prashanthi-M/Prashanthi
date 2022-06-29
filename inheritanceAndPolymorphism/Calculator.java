package inheritanceAndPolymorphism;

public class Calculator {
	public int sum(int a,int b) {
		int c=a+b;
		int d=c/2;
		return d;
	}
	public int sum(int a,int b,int h) {
		int e=a+b+h;
		int f=e/3;
		return f;
	}
	public int sum(int a,int b,int c,int d) {
		int g=a+b+c;
		int r=g/4;
		return r;
	}
	public static void main(String[] args) {
		Calculator c=new Calculator();
		System.out.println(c.sum(5, 15));
		System.out.println(c.sum(6, 9,20));
		System.out.println(c.sum(3, 6,9,87));
	}

}
