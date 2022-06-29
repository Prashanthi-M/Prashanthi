package hashMap;

import java.util.HashMap;

public class HashCha {
	public static void main(String[] args) {
		HashMap<Character,Float> c=new HashMap<>();
		c.put('a', 7.5f);
		c.put('d', 6.3f);
		System.out.println(c);
		for(Character c1:c.keySet()) {
			System.out.println(c1);
			
		}
		for(Float f:c.values()) {
			System.out.println(f);
		}
		
	}
}
