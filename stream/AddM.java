package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AddM {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(35);
	 List<Boolean> l=a.stream().map(x->x>10).collect(Collectors.toList());
		l.forEach(x->System.out.println(x));
		for(Boolean b:l) {
			System.out.println(b);
		}
		System.out.print(l);
		
		
		
		ArrayList<Integer> a1=new ArrayList<>();
		a1.add(10);
		a1.add(20);
		a1.add(35);
		List<Integer> f1=a1.stream().map(x->x+10).collect(Collectors.toList());
		l.forEach(x->System.out.println(x));
		for(Integer b1:f1) {
			System.out.println(b1);
		}
		System.out.print(f1);
		
		
		
		
		

	}

}
