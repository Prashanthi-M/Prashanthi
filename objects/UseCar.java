package objects;

public class UseCar {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.brand = "Benz";
		c1.price=1500000;
		c1.rating=4.5f;
		c1.isPetrol=true;
		c1.batNo=15687898l;
		c1.batTyp='A';
		c1.taxPer=20;
		c1.taxAmt=10000;
		c1.netPrice=c1.price+c1.taxAmt;
		c1.netPrice1=c1.price+(c1.price*c1.taxPer/100);
		System.out.println("Brand Name="+c1.brand+",NetPrice1="+c1.netPrice1+",Rating="+c1.rating);
		Car c2 = new Car();
		c2.brand="Suzuki";
		c2.price=1000000;
		c2.rating=4.6f;
		c2.isPetrol=false;
		c2.batNo=17899900l;
		c2.batTyp='E';
		c2.taxPer=10;
		c2.taxAmt=50000;
		c2.netPrice=c2.price+c2.taxAmt;
		c2.netPrice2=c2.price+(c2.price*c2.taxPer/100);
		System.out.println("Brand Name="+c2.brand+",NetPrice2="+c2.netPrice2+",Rating"+c2.rating);
		Car c3=new Car();
		c3.brand="Benz";
		c3.price=1000000;
		c3.rating=4.8f;
		c3.isPetrol=true;
		c3.batNo=57989000l;
		c3.batTyp='C';
		c3.taxPer=10;
		c3.taxAmt=20000;
		c3.netPrice=c3.price+c3.taxAmt;
		c3.netPrice3=c3.price+(c3.price*c3.taxPer/100);
		System.out.println("Brand Name="+c3.brand+",Rating="+c3.rating+",NetPrice3="+c3.netPrice3);
		
	}
	}


