package oops;

public class Pen {
	String brand;
	int price;
	Ink ink;
	
	
	public Pen(String brand,int price,Ink ink) {
		this.brand=brand;
		this.price=price;
		this.ink=ink;
	}
	public String toString() {
		return "BRAND= "+brand+", Price= "+price+", INK= "+ink;
	}
	

}
