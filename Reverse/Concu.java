package Reverse;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class Concu {
	public static void main(String[] args) {
		ConcurrentHashMap<Integer,String> hr=new ConcurrentHashMap<>();
		hr.put(0,"Anu");
		Iterator<String> itr=hr.values().iterator();
		while(itr.hasNext()) {
			hr.put(1,"Aravi");
			hr.put(2,"kjfjdf");
			hr.put(3,"jdhejkd");
			System.out.println(itr.next());
		}
		
		
	}

}
