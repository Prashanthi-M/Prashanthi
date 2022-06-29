package hashMap;

import java.util.HashMap;

public class HasSam {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1,"MAni");
		hm.put(2,"Saran");
	    hm.put(3,"Maran");
	    hm.put(2,"Sam");
	    hm.put(1,"Pavi");
	    System.out.println(hm);
	    for(Integer i:hm.keySet()) {
	    	System.out.println(i);
	    }
	    for(String s:hm.values()) {
	    	System.out.println(s);
	    }
	    
	}

}
