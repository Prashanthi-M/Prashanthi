package inheritanceAndPolymorphism;

public class Cycle {
	public void Pedaling() {
		System.out.println("Pedaling");
	}
	public String name(String a) {
		if(a.equals("Hero")) {
			return "Same name";
		}
		else {
			return "Different name ";
		}
	}
 
}
