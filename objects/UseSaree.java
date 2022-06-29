package objects;


public class UseSaree {
	public static void main(String[] args) {
		Saree s1 = new Saree();
		s1.material = "Silk";
		s1.colour = "Red";
		s1.price = 1000;
		s1.discountAmt=500;
		s1.netprice = s1.price-s1.discountAmt;
		s1.rating = 4.5f;
		s1.itIsHeavy = false;
		s1.barCode = 1789077455789l;
	    Saree s2 = new Saree();
	    s2.material = "Cotton";
	    s2.colour = "Black";
	    s2.price = 2500;
	    s2.discountper = 20;
	    s2.netPrice1 = s2.price-(s2.price*20/100);
		System.out.println("MATERIAL="+s1.material+",COLOUR="+s1.colour+",PRICE="+s1.netprice+",RATING="+s1.rating+",HEAVY="+s1.itIsHeavy+",LIGHT");
		System.out.println("Material="+s2.material+",colour="+s2.colour+",price="+s2.price+",discountper="+s2.discountper+",Netprice1="+s2.netPrice1);
	}
	}


