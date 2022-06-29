package day22;

public class Null {
	public static void main(String[] args) {
		String a=null;
		try {
			System.out.println(a);
		
		}catch(NullPointerException np) {
			System.out.println(np);
		}
		
	}

}
