package conditionInsideForLoop;

public class StrNum {
	public static void main(String[] args) {
		String a="17JN5A0505";
		int count=0;
		int count1=0;
		char b[]=a.toCharArray();
		for(int i=0;i<b.length;i++) {
			if((b[i]>='a'&&b[i]<='z')||(b[i]>='A'&&b[i]<='Z')) {
				count++;
			}
			else {
				count1++;
			}
		}
		System.out.println("count of letters: "+count);
		System.out.println("count of numbers: "+count1);
		
	}

}
