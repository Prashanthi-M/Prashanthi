package hashMap;

import java.util.HashMap;

public class HasD {
	public static void main(String[] args) {
		HashMap<Double,Long> hm=new HashMap<>();
		hm.put(8789.788d,97889088900l);
		hm.put(7367.873d,6890266789l);
		System.out.println(hm);
		for(Double d:hm.keySet()) {
			System.out.println(d);
		}
		for(Long l:hm.values()) {
			System.out.println(l);
		}
	}

}
