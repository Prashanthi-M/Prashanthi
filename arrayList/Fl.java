package arrayList;

import java.util.ArrayList;

public class Fl {
	public static void main(String[] args) {
		ArrayList<Float> f=new ArrayList<>();
		f.add(6.7f);
		f.add(5.4f);
		f.add(4.3f);
		f.forEach((x)->System.out.println(x));
		
		
	}

}
