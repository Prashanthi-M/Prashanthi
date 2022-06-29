package dataAbstraction;

public class Car implements Transport,Vehicle  { 
	
	int rtPer;
	int gstPer;
	public int roadTax(int amount) {
		return amount*rtPer/100;
	}
	public int gstTax(int amount) {
		return amount*gstPer;
	}
	String brand;
	String color;
	int price;
	int tax;

}
