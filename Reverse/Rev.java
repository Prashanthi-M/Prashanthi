package Reverse;

public class Rev {
	public static void main(String[] args) {
		String name="Java";
		char search='a';
		int count=0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)==search) {
			count++;
			}
		}
		System.out.println(count);
	}

}
