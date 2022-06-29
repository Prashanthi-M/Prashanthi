package objectArrayUsingForLoop;

public class UseLaptop {

	public static void main(String[] args) {
		Laptop l1=new Laptop();
		l1.brand="Dell";
		l1.price=50000;
		l1.color="Black";
		Laptop l2=new Laptop();
		l2.brand="Hp";
		l2.price=75000;
		l2.color="Grey";
		Laptop l3=new Laptop();
		l3.brand="Apple";
		l3.price=90000;
		l3.color="White";
		Laptop l4=new Laptop();
		l4.brand="Acer";
		l4.price=60000;
		l4.color="Red";
		Laptop l5=new Laptop();
		l5.brand="Hasee";
		l5.price=90000;
		l5.color="White";
		Laptop l6=new Laptop();
		l6.brand="Lenovo";
		l6.price=65000;
		l6.color="Blue";
		Laptop l7=new Laptop();
		l7.brand="Apple1";
		l7.price=90000;
		l7.color="WhiteGrey";
		Laptop l8=new Laptop();
		l8.brand="Ace";
		l8.price=96000;
		l8.color="Blueish";
		Laptop l9=new Laptop();
		l9.brand="App";
		l9.price=70000;
		l9.color="DarkBlack";
		Laptop l10=new Laptop();
		l10.brand="Oppo";
		l10.price=82000;
		l10.color="Pink";
		Laptop[] a= {l1,l2,l3,l4,l5,l6,l7,l8,l9,l10};
		int count=0;
		//String name="";
		
		for(int i=0;i<a.length;i++) {
			count=count+a[i].price;
			//name=name.concat(a[i].brand);

		}

		System.out.println(count);







		

	}

}
