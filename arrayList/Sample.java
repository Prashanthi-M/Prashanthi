package arrayList;

import java.util.ArrayList;

public class Sample {
	public static void main(String[] args) {
		ArrayList<Integer> li=new ArrayList<>();
		li.add(45);
		li.add(46);
		li.add(77);
		li.add(67);
		li.add(89);
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
		for(Integer i:li) {
			System.out.println(i);
		}
		
	}

}
