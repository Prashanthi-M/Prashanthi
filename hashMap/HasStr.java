package hashMap;

import java.util.HashMap;

public class HasStr {
	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<>();
		hm.put("Fun","MAni");
		hm.put("Sara", "MOna");
		System.out.println(hm);
		for(String s:hm.keySet()) {
			System.out.println(s);
		}
		for(String d:hm.values()) {
			System.out.println(d);
		}
		
	}

}
