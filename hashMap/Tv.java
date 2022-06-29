package hashMap;

public class Tv {
	String brand;
	int inch;
	int price;
	String display;
	public Tv(String brand,int inch,int price,String display) {
		this.brand=brand;
		this.inch=inch;
		this.price=price;
		this.display=display;
		
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDisplay() {
		return display;
	}
	public void setDisplay(String display) {
		this.display = display;
	}
	public String toString() {
		return brand+" "+inch+" "+price+" "+display;
	}
	
	

}
