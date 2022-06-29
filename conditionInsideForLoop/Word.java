package conditionInsideForLoop;

public class Word {
	public static void main(String[] args) {
		String a="CHaiR";
		int count=0;
		int count1=0;
		char[] b=a.toCharArray();
		for(int i=0;i<a.length();i++) {
			if(b[i]>='A'&&b[i]<='Z') {
				count++;
			}
			else {
				count1++;
			}
			
			
		}
		System.out.println("The uppercase count is "+count);
	}

}


