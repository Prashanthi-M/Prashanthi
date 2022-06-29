package oops;

public class Car {
	private int price;
	private String brand;
	private String color;
	private Engine engine;
	
	public String carDetails() {
		
		return brand+" "+price+" "+color+" "+engine.engineDetails();
	}
 	public  void setprice(int price) {
 		this.price=price;
 	}
 	public void setbrand(String brand) {
 		this.brand=brand;
 	}
 	public void setcolor(String color) {
 		this.color=color;
 	}
 	public void setengine(Engine engine) {
 		this.engine=engine;
 	}
 	public int getprice() {
 		return this.price;
 	}
 	public String getbrand()
 	{
 		return this.brand;
 		
 	}
 	public  String getcolor() {
 		return this.color;
 	}
 	public Engine getengine() {
 		return this.engine;
 	}
 	
}
