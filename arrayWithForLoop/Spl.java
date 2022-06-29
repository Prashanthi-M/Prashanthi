package arrayWithForLoop;

public class Spl {
	public static void main(String[] args) {
		int[] a= {10,20,30,40,50,60};
		for(int i=0;i<a.length;i=i+2) {
			System.out.println(a[i]);
		}
	}

}
