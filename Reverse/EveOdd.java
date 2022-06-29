package Reverse;

import java.util.ArrayList;
import java.util.Arrays;

public class EveOdd {
	public static void main(String[] args) {
        int[] num= {2,7,6,3,7,4,5,8};
        int[] num1= new int[(num.length)];
        int odd=num.length;
        int even=0;
		//ArrayList<Integer> ar=new ArrayList<>();
		
		//ar.add(num);
		for(int i=0;i<num.length;i++) {
			if(num[i]%2==0) {
				num1[even++]=num[i];
			}
			else {
				num1[--odd]=num[i];
			}

		
	}
	System.out.println(Arrays.toString(num1));
	

	}
}
