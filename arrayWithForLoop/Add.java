package arrayWithForLoop;

public class Add {
	public static void main(String[] args) {
		int[] a= {10,20,30,40,50,60};
		int add=0;
		for(int i=0;i<a.length;i++) {
			add=add+a[i];
		}
		System.out.println(add);
	}

}
