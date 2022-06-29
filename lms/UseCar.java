package lms;

public class UseCar {
	public static void main(String[] args) {
		Car car=new Car();
		car.brand=args[0];
		car.color=args[1];
		car.price=Integer.parseInt(args[2]);
		car.taxAmt=Integer.parseInt(args[3]);
		car.netPrice=car.price+car.taxAmt;
		System.out.println("BRAND="+car.brand+" Colour="+car.color);
		
		
	}
	}


