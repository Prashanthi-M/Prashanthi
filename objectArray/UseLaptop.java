package objectArray;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop l1=new Laptop();
		Laptop l2=new Laptop();
		Laptop l3=new Laptop();
		l1.brand="Dell";
		l1.price=37000;
		l1.color="Black";
		l2.brand="Hp";
		l2.price=28000;
		l2.color="White";
		l3.brand="Lenovo";
		l3.price=32000;
		l3.color="Blue";
		Laptop[] lp= {l1,l2,l3};
		int add=0;
		for(int i=0;i<lp.length;i++) {
			if(lp[i].price>30000) {
				add=lp[i].price+3000;
				System.out.println(add+" "+lp[i].brand+" "+lp[i].color);
			}
		}
	}

}
