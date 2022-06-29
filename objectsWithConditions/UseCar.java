package objectsWithConditions;

public class UseCar {
	public static void main(String[] args) {
		Car c1=new Car();
		c1.brand="BMW";
		c1.price=500000;
		c1.rating=4.8f;
		c1.colour="Black";
		Car c2=new Car();
		c2.brand="Tata";
		c2.price=400001;
		c2.rating=4.3f;
		c2.colour="White";
		if((c1.brand.length()>c2.brand.length())) {
			System.out.println(c1.brand+" is highest size than"+" "+c2.brand);
		}
		else {
			System.out.println(c2.brand+" is highest size than"+" "+c1.brand);
		}
		
		
	}
	}


