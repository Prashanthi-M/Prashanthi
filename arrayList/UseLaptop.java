package arrayList;

import java.util.ArrayList;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop l1=new Laptop("Lenovo",50000,"Grey");
		Laptop l2=new Laptop("Acer",78000,"Black");
		Laptop l3=new Laptop("Hasee",58000,"Red");
		ArrayList<Laptop> l=new ArrayList<>();
		l.add(l1);
		l.add(l2);
		l.add(l3);
		ArrayList<Laptop> high=new ArrayList<>();
		for(Laptop i:l) {
			if(i.getPrice()>70000) {
				high.add(i);
				System.out.println(i.getBrand().toUpperCase());
			}
			else {
			high.add(i);
			}
		}
		
	}


}
