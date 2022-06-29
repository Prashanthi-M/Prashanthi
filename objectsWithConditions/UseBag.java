package objectsWithConditions;

public class UseBag {
	public static void main(String[] args) {
		Bag b1=new Bag();
		b1.brand="Tech";
		b1.price=5000;
		b1.tax=30;
		b1.netPrice=b1.price+b1.tax;
		Bag b2=new Bag();
		b2.brand="Pig";
		b2.price=25000;
		b2.tax=20;
		b2.netPrice=b2.price+b2.tax;
		int discount=1000;
	    if(b1.price>b2.price) {
			System.out.println(b1.netPrice-discount);
		}
		else {
			System.out.println(b2.netPrice-discount);
		}
		
	}
	}



