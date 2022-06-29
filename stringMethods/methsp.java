package stringMethods;

public class methsp {
	public static void main(String[] args) {
		String name="Java,PYTHON,C++";
		String[] a=name.split(",");
		int l=a[0].length();
		int l1=a[1].length();
		int l2=a[2].length();
		System.out.println(l);
		System.out.println(l1);
		System.out.println(l2);
		String lo=a[0].toLowerCase();
		String lo1=a[1].toLowerCase();
		String lo2=a[2].toLowerCase();
		System.out.println(lo);
		System.out.println(lo1);
		System.out.println(lo2);
		
	}

}
