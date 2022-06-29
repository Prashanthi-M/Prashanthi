package Reverse;

import java.util.ArrayList;

public class Splitting {
	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<>();
		ar.add("Anu");
		ar.add("Pavithra");
		ar.add("Kamala");
		ar.add("Anand");
		ar.add("Prerna");
		ar.add("Mullai");
		ArrayList<String> d=new ArrayList<>();
		ArrayList<String> c=new ArrayList<>();
		for(int i=0;i<ar.size()/2;i++) {
			d.add(ar.get(i));

		}
		System.out.println(d);
		for(int i=ar.size()/2;i<ar.size();i++) {
			c.add(ar.get(i));

		}
		System.out.println(c);
	}

}
