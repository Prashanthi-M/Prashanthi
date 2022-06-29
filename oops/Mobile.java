package oops;

public class Mobile {
	private String brand;
	private int price;
	private String model;
	private Processor processor;

	public Mobile(String brand,int price,String model,Processor processor) {
		this.brand=brand;
		this.price=price;
		this.model=model;
		this.processor=processor;
	}
	public String getbrand() {
		return this.brand;
	}
	public int getprice() {
		return this.price;
	}
	
}
