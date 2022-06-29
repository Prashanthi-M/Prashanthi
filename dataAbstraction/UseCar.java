package dataAbstraction;

public class UseCar {
	public static void main(String[] args) {
		Car c=new Car();
		c.rtPer=10;
		c.gstPer=18;
		System.out.println(c.roadTax(20000));
		System.out.println(c.gstTax(4000));

		Car c1=new Car();
		c1.brand="Benz";
		c1.color="Black";
		c1.price=40000;
		c1.rtPer=12;
		c1.gstPer=18;
		
		
		Car c2=new Car();
		c2.brand="Bmw";
		c2.color="White";
		c2.price=30000;
		c2.rtPer=12;
		c2.gstPer=18;
		
		Car c3=new Car();
		c3.brand="Tata";
		c3.color="Blue";
		c3.price=500000;
		c3.rtPer=18;
		c3.gstPer=18;
		
		System.out.println(c1.brand+" "+c1.color+" "+c1.price+" "+c1.roadTax(c1.price)+" "+c1.gstTax(c1.price));
		System.out.println(c2.brand+" "+c2.color+" "+c2.price+" "+c2.roadTax(c2.price)+" "+c2.gstTax(c2.price));
		System.out.println(c3.brand+" "+c3.color+" "+c3.price+" "+c3.roadTax(c3.price)+" "+c3.gstTax(c3.price));
		
	}



}
