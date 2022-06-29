package dataAbstraction;

public class State1 implements State {
	public String stateCode(String a) {
		return a;
	}
	public String noPlateColor(String b) {
		if(b.equalsIgnoreCase("black&white")) {
			return "Private vehicle";
		}
		else if(b.equalsIgnoreCase("black&yellow")) {
			return "Public vehicle";
		}
		else if(b.equalsIgnoreCase("Green&White")) {
			return "Electric vehicle";
		}
		else {
			return "Invalid";
		}
	}
	

}
