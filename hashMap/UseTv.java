package hashMap;

import java.util.HashMap;
import java.util.Iterator;

public class UseTv {
	public static void main(String[] args) {
		Tv t1=new Tv("Sony",49,80000,"OLED");
		Tv t2=new Tv("Samsung",32,50000,"LED");
		Tv t3=new Tv("LG",42,60000,"LCD");
		HashMap<Integer,Tv> hm=new HashMap<>();
		hm.put(1, t1);
		hm.put(2, t2);
		hm.put(3, t3);
		System.out.println(hm);
		Iterator<Integer> it=hm.keySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		Iterator<Tv> itr=hm.values().iterator();
		while(itr.hasNext()) {
			//System.out.println(itr.next());
		//}
		Tv t=itr.next();
		if(t.getBrand().startsWith("S")) {
			System.out.println(t);
		}
		}
		int max=0;
		String d="";
		Iterator<Tv> ts=hm.values().iterator();
		//for(Tv s:hm.values()) {
		while(ts.hasNext()) {
			Tv t=ts.next();
	    	if(t.getBrand().length()>max) {
	    		max=t.getBrand().length();
	    		
	    	}
	    	
	    	
	    }
		System.out.println(max);
		int min=t1.brand.length();
		Iterator<Tv> f=hm.values().iterator();
		while(f.hasNext()) {
			Tv g=f.next();
			if(g.getBrand().length()<min) {
				min=g.getBrand().length();
				
			}
		}
		System.out.println(min);
		int max1=0;
		int percentage=12;
		Iterator<Tv> l=hm.values().iterator();
		while(l.hasNext()) {
			Tv h=l.next();
			if(h.getPrice()>max) {
				max=h.getPrice()-(h.getPrice()*12/100);
				
			}
		}
		System.out.println(max);
		int count=0;
		Iterator<Tv> m=hm.values().iterator();
		while(m.hasNext()) {
			Tv k=m.next();
			if(k.getInch()>40) {
				count++;
			}
		}
		
		System.out.println(count);
			
		}
		
	}


