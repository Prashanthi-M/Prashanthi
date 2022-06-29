package stringMethods;

public class MethodeqI {
	public static void main(String[] args) {
		String name="fidel";
		boolean name1=name.equalsIgnoreCase("fidel");
		boolean name2=name.equalsIgnoreCase("FIDEL");
		System.out.println(name1);
		System.out.println(name2);
	}

}
