package oops;

public class Ink {
	String brand;
	String color;
	String mfgdate;
	
	
	public Ink(String brand,String color,String mfgdate ) {
		this.brand=brand;
		this.color=color;
		this.mfgdate=mfgdate;
	}
	public String toString() {
		return "BRAND= "+brand+", COLOR= "+color+", MANUFACTDATE= "+mfgdate;
	}

}
