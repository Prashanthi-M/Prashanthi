package objects;

public class UseMobile {
	public static void main(String[] args) {
		Mobile m1= new Mobile();
		m1.colour="Black";
		m1.model="Realme";
		m1.rating=7.5f;
		m1.price=20000;
		m1.discountPer=10;
		m1.netPrice=m1.price-(m1.price*m1.discountPer/100);
		m1.isTouch=true;
		m1.batteryType='A';
		System.out.println("Model="+m1.model+",Colour="+m1.colour+",isTouch="+m1.isTouch+",NetPrice="+m1.netPrice);
	}
	}


