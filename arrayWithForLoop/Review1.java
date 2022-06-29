package arrayWithForLoop;

public class Review1 {
	public static void main(String[] args) {
		String[] a= {"Java","Javascript","python","mysql","Helloworld","Universe"};
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i].charAt(a[i].length()-3));
		}
	}

}
