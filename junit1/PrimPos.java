package junit1;

public class PrimPos {
	public static void main(String[] args) {
	int a=55;                                                                                                          
	//public void prime() {
		int count=0;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(a+" it is a prime");
			
		}
		else {
			System.out.println(a+" it is not a prime");
		}
	}
	
		//public void pos() {
		//	if(a>=0) {
			//	System.out.println("Positive");
				
			//}
			//else {
			//	System.out.println("Negative");
		//}
		
	
	}
	

//}
