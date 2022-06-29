package hashMap;

import java.util.HashMap;
import java.util.Iterator;

public class UseMarker {
	public static void main(String[] args) {
		Marker m1=new Marker("Reynolds",25,"Black");
		Marker m2=new Marker("Camlin",30,"Blue");
		Marker m3=new Marker("Doms",35,"Blue");
		HashMap<String,Marker> hm=new HashMap<>();
		hm.put("a", m1);
		hm.put("b", m2);
		hm.put("c", m3);
		System.out.println(hm);
		hm.forEach((K,V)->System.out.println(K+" "+V));
		Iterator<Marker> t=hm.values().iterator();
		while(t.hasNext()) {
			Marker k=t.next();
			if(k.getPrice()>30) {
				System.out.println(k);
			}
		}
		hm.forEach((x,n)-> { if(n.getPrice()%2==0) {
			System.out.println("Even");
				
			}
		else {
			System.out.println("Odd");
		}}
	);
		hm.forEach((g,k)-> { if(k.getBrand().contains("a")||k.getBrand().contains("e")||k.getBrand().contains("i")||k.getBrand().contains("o")||k.getBrand().contains("u")) {
			System.out.println("Vowels");
		}
		else {
			System.out.println("NotVowel");
		}
		});
	
		
		
		
	}

}
