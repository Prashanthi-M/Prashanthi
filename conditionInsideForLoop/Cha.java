package conditionInsideForLoop;

public class Cha {
	public static void main(String[] args) {
		String a="Bhavani";
		char[] b=a.toCharArray();
		int count=0;
		int count1=0;

		for(int i=0;i<b.length;i++) {

			if(b[i]==('a')||b[i]=='e'||b[i]=='i'||b[i]=='o'||b[i]=='u') {
				System.out.println(b[i]+ " is a vowel ");
				count++;
			}
			else {
				System.out.println(b[i]+" is not a vowel");
				count1++;
			}
			
		}
		System.out.println("Count of vowels is "+count);
		System.out.println("Count of not a vowel is "+count1);
	}

}
