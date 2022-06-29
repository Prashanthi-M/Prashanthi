package arrayList;

import java.util.ArrayList;

public class SamCha {
	public static void main(String[] args) {
		ArrayList<Character> ch=new ArrayList<>();
		ch.add('a');
		ch.add('b');
		ch.add('c');
		for(int i=0;i<ch.size();i++) {
			System.out.println(ch.get(i));
		}
		for(Character i:ch) {
			System.out.println(i);
		}
		
	}

}
