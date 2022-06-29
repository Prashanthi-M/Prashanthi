package arrayWithForLoop;

public class Max {
	public static void main(String[] args) {
		int[] a= {50,90,100,70,80,10};
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
