package arrayList;

public class Re {
	private String brand;
	private int price;
	private String model;
	private String color;
	
	public Re(String brand,int price,String model,String color) {
		this.brand=brand;
		this.price=price;
		this.model=model;
		this.color=color;
	}
	public String setBrand(String brand) {
		return this.brand=brand;
	}
	public int setPrice(int price) {
		return this.price=price;
	}
	public String setModel(String model) {
		return this.model=model;
	}
	public String setcolor(String color) {
		return this.color=color;
	}
	public String getBrand() {
		return this.brand;
	}
	public int getPrice() {
		return this.price;
	}
	public String getModel() {
		return this.model;
	}
	public String getColor() {
		return this.color;
	}
	public String toString(String brand,int price,String model,String color) {
		return brand+" "+price+" "+model+" "+color;
	}

}
