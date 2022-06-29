package Reverse;

public class Rege {
	public static void main(String[] args) {
		String name="The@way@of@contains";
		for(String names:name.split("\\W",4)) {
			System.out.println(names);
		}
	}

}
