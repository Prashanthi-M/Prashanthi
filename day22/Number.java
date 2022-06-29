package day22;

public class Number {
	public static void main(String[] args) {
		String a="Java";
		try {
			int b=Integer.parseInt(a);
		}catch(NumberFormatException ne) {
			System.out.println(ne);
			
		}
	}

}
