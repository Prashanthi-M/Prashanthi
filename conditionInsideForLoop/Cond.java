package conditionInsideForLoop;

public class Cond {
	public static void main(String[] args) {
		int count=0;
		int count1=0;
		for(int i=0;i<=10;i++) {
			if(i<5) {
				System.out.println(i+" is smaller than 5");
				count++;
			}
			else {
				System.out.println(i+" is greater than 5");
				count1++;
			}
		}
		System.out.println("Count of smaller than 5 is "+count);
		System.out.println("Count of greater than 5 is "+count1);

	}

}
