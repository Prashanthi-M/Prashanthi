package conditionInsideForLoop;

public class CondnF {
	public static void main(String[] args) {
		int count=0;
		int count1=0;
		for(int i=0;i<=10;i++) {
			if(i%2==0) {
				System.out.println(i+" is Even Number");
				count++;
				
			}
			else {
				System.out.println(i+" is Odd Number");
				count1++;
			}
		}
			System.out.println("Count of even no is "+count);
			System.out.println("Count of odd no is "+count1);
		
	}

}
