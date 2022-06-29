package stringMethods;

public class MethodCars {
	public static void main(String[] args) {
		String c="innova swift tata";
		String a=c.toUpperCase();
		String[] b=a.split(" ");
		System.out.println(a);
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		int d=b[0].length();
		System.out.println(d);
		System.out.println("The Innova length is "+d);
		int e=c.length();
		System.out.println(e);
	}

}
