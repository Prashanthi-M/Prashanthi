package arrayList;

import java.util.ArrayList;

public class SamStr {
	public static void main(String[] args) {
		ArrayList<String> s=new ArrayList<>();
		s.add("Srm");
		s.add("Java");
		s.add("Fun");
		for(int i=0;i<s.size();i++) {
			System.out.println(s.get(i));
		}
		for(String i:s) {
			System.out.println(i);
		}
		
	}

}
