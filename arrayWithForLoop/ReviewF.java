package arrayWithForLoop;

public class ReviewF {
	public static void main(String[] args) {
		String[] a= {"Java","Javascript","python","mysql","Helloworld","Universe"};
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i].charAt(a[i].length()-3));
		}

	}

}
