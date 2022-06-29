package arrayWithForLoop;

public class Fact {
	public static void main(String[] args) {
		int[] a= {10,20,30,40,50,60};
		int mul=1;
		for(int i=0;i<a.length;i++) {
			mul=mul*a[i];
			
				
		}
		System.out.println(mul);
	}

}
