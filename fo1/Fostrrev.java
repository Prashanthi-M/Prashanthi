package fo1;

public class Fostrrev {
	public static void main(String[] args) {
		String word="Hello world";
		for(int i=word.length()-1;i>=0;i--) {
			System.out.println(word.charAt(i));
		}
	}

}
