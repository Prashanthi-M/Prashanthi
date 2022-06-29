package lms;

public class UseBike {
	public static void main(String[] args) {
		Bike b=new Bike();
		String[] c=args[0].split("/");
		b.brand=c[0];
		b.color=c[1];
		b.rating=Float.parseFloat(c[2]);
		b.price=Integer.parseInt(c[3]);
		System.out.println("BRAND="+b.brand);
		System.out.println("COLOR="+b.color);
		System.out.println("Rating="+b.rating);
		System.out.println("Price="+b.price);
		
	}
	}


