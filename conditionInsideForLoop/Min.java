package conditionInsideForLoop;

public class Min {
	public static void main(String[] args) {
		int a[]= {40,5,89,100,4,8};
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
				
			}
		}
		System.out.println(min);
	}

}
