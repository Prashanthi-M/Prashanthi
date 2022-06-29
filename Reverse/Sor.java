package Reverse;

import java.util.ArrayList;
import java.util.Collections;

public class Sor {
	public static void main(String[] args) {
		int[] a= {10,27,33};
		ArrayList<Integer> ar=new ArrayList<>();
	 //   for(int i=0;i<a.length;i++) {
		//	if(a[i]>20) {
		//		ar.add(a[i]);
		//		}
		//}
		//ar.stream().sorted();
		//System.out.println(ar);
		ar.add(a[0]);
		ar.add(a[1]);
		ar.add(a[2]);
		for(Integer value:ar) {
			if(value%2==0) {
				System.out.println(value+" It is a even number");
			}
			else {
				System.out.println(value+" it is not a even number");
			}
		}
	}
}
  