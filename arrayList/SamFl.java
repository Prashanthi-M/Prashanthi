package arrayList;

import java.util.ArrayList;

public class SamFl {
	public static void main(String[] args) {
		ArrayList<Float> li=new ArrayList<>();
		li.add(6.7f);
		li.add(8.9f);
		li.add(3.2f);
		li.add(4.2f);
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
		for(Float i:li) {
			System.out.println(i);
		}
	}

}
