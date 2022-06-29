package stringMethods;

public class MethodSp {
	public static void main(String[] args) {
		String name="mango apple banana";
		String[] a=name.split(" ");
		System.out.println(a[0]+" "+a[1]+" "+a[2]);
		String[] b=name.split("o");
		System.out.println(b[0]+" "+b[1]);
	}

}
