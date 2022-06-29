package conditionInsideForLoop;

public class Rev {
	public static void main(String[] args) {
		String b="Madam";
		String a="";

		for(int i=b.length()-1;i>=0;i--) {
			a=a+b.charAt(i);
			if(b.equals(b)) {
				
				System.out.println("The given word is palindrome");
				
				
			}
			else {
				System.out.println("The given word is not a palindrome");
			}
			
			
			
			
		}
		
		
	}

}
 