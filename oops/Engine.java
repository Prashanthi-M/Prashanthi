package oops;

public class Engine {
	private String brand;
	private int price;
	private int hp;

	public void setprice(int price) {
		this.price=price;
	}
	public void setbrand(String brand) {
		this.brand=brand;
		
	}
	public void sethp(int hp) {
		this.hp=hp;
	}
	public int getprice() {
		return this.price;
	}
	public String getbrand() {
		return this.brand;
	}
	public int gethp() {
		return this.hp;
	}

public String engineDetails() {
	return brand+" "+price+" "+hp;
}
}