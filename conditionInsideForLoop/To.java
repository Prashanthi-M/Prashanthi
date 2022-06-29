package conditionInsideForLoop;

public class To {
	public static void main(String[] args) {
		int num=4;
		int total=0;
		for(int i=0;i<=num;i++) {
			total=total+i*(i+1)/2;
			
		}
		System.out.println(total);
		
	}

}
