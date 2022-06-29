package arrayList;

import java.util.ArrayList;

public class Squa {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(76);
		a.add(53);
		a.add(29);
		a.add(34);
		for(int i=0;i<a.size();i++) {
			if(a.get(i)%2==0) {
				System.out.println(a.get(i)+" even Number");
				
			}
			else {
				System.out.println(a.get(i)+" odd number");
			}
		}
		
	}

}
