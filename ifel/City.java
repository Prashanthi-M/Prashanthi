package ifel;

public class City {
	public static void main(String[] args) {
		String word="Kochin";
		if(word.contains("Chennai")) {
			System.out.println(word+" Capital of TamilNadu");
		}
		else if(word.contains("Kochin")) {
			System.out.println(word+" Capital of Kerala");
		}
		else if(word.contains("Hyderabad")) {
			System.out.println(word+" Capital of Telangana");
		}
		else if(word.contains("Bangalore")) {
			System.out.println(word+" Capital of Karnataka");
		}
		else {
			System.out.println("Invalid");
		}
	}
	}


