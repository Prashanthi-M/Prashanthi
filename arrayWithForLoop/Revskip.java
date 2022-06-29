package arrayWithForLoop;

public class Revskip {
	public static void main(String[] args) {
		
	
	int[] a= {10,20,30,40,50,60};
	for(int i=a.length-1;i>=0;i=i-2) {
		System.out.println(a[i]);
	}

	}

}
