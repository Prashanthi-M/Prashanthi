package objectArrayUsingForLoop;

public class UseCar {
	public static void main(String[] args) {
		Car c1=new Car();
		c1.brand="Innovo";
		c1.price=100000;
		c1.color="Black";
		Car c2=new Car();
		c2.brand="Audi";
		c2.price=200000;
		c2.color="Blue";
		Car c3=new Car();
		c3.brand="Suzuki";
		c3.price=300000;
		c3.color="White";
		Car[] a= {c1,c2,c3};
		int count=0;
		int disPrice=50;
		for(int i=0;i<a.length;i++) {
			disPrice=a[i].price-(a[i].price*a[i].disPrice/100);
		}
		System.out.println(disPrice);

	}

}
