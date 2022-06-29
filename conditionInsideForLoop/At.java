package conditionInsideForLoop;

public class At {
	public static void main(String[] args) {
		String a="@1@2#38012@*superaqw*(";
		int count=0;
		int count1=0;
		int count2=0;
		char[] b=a.toCharArray();
		for(int i=0;i<b.length;i++) {
			if(b[i]>='0' && b[i]<='9') {
				count++;
			}
			else if(b[i]>='a'&&b[i]<='z') {
				count1++;
			}
			else {
				count2++;
			}
		}
		System.out.println("The numbers: "+count);
		System.out.println("characters: "+count1);
		System.out.println("Special Character: "+count2);

	}


}
