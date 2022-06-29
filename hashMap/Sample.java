package hashMap;

import java.util.HashMap;
import java.util.Iterator;

public class Sample {
	public static void main(String[] args) {
		HashMap<Integer,Float> f=new HashMap<>();
		f.put(1,2.7f);
		f.put(2,3.4f);
		f.put(3,4.2f);
		for(Integer a:f.keySet()) {
			System.out.println(a);
		}
		for(Float b:f.values()) {
			System.out.println(b);
		}
		Iterator<Integer> f1=f.keySet().iterator();
		while(f1.hasNext()) {
			System.out.println(f1.next());
			
		}
		float max=0;
		Iterator<Float> f2=f.values().iterator();
		while(f2.hasNext()) {
			float b=f2.next();
			if(max<b) {
				max=b;
			}
		}
		System.out.println(max);
		
	}

}
