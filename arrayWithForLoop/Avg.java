package arrayWithForLoop;

public class Avg {
	public static void main(String[] args) {
		int[] a= {10,20,30,40,50,60};
		int total=0;
		int count=0;
		for(int i=0;i<a.length;i++) {
			total=total+a[i];
			count=count+1;
		}
		System.out.println(total/count);
		
	}

}
