package hashMap;

import java.util.HashMap;

public class HasI {
	public static void main(String[] args) {
		HashMap<Integer,Boolean> b=new HashMap<>();
		b.put(7899,true);
		b.put(87638,false);
		System.out.println(b);
		for(Integer i:b.keySet()) {
			System.out.println(i);
		}
		for(Boolean d:b.values()) {
			System.out.println(d);
		}
		
	}
}
