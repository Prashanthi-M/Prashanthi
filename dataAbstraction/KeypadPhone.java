package dataAbstraction;

public class KeypadPhone implements Phone {
	public String network(String a) {
		return "This Phone had "+a;
		
	}
	public String camera(String b) {
		return "This Phone had "+b;
		
	}
	String brand;
	String color;
	int price;


}
