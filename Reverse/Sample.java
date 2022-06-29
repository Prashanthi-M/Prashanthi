package Reverse;

import java.util.ArrayList;
import java.util.List;

public class Sample {
	public static void main(String[] args) {
		String[] name= {"Anuwe","Aravi","Var32"};
		ArrayList<String> detail=new ArrayList<>();
		for(String value:name) {
			detail.add(value);
		}
		List<String> names=detail.subList(0, 1);
		System.out.println(names);
	} 

}
