package oops;

public class Bike {
	private int price;
	private String brand;
	private String color;
	public Bike(int price,String brand,String color) {
		this.price=price;
		this.brand=brand;
		this.color=color;
	}
 public String toString() {
	 return "BRAND= "+brand+", PRICE= "+price+", COLOR= "+color;
 }
 
}
