package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Fun8 {
	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<>();
		a.add("One");
		a.add("Two");
		a.add("three");
		a.add("four");
		List<String> f=a.stream().map(y->y.substring(0,3)).collect(Collectors.toList());
		System.out.println(f);
		a.forEach(x->System.out.println(x));
		
		List<Integer> c=a.stream().map(x->x.length()).collect(Collectors.toList());
		for(Integer l:c) {
			System.out.println(l);
		}
		
		List<Boolean> d=a.stream().map(x->x.equals(x)).collect(Collectors.toList());
		for(Boolean l:d) {
			System.out.println(l);
		}
		
		List<String> h=a.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
		for(String l:h) {
			System.out.println(l);
		}
		
		List<String> j=a.stream().map(x->x.toLowerCase()).collect(Collectors.toList());
		for(String l:j) {
			System.out.println(l);
		}
		
		
		List<Integer> p=a.stream().map(x->x.indexOf('o')).collect(Collectors.toList());
		for(Integer l:p) {
			System.out.println(l);
		}

		
		List<Character> k=a.stream().map(x->x.charAt(0)).collect(Collectors.toList());
		for(Character l:k) {
			System.out.println(l);
		}
		
		List<Boolean> v=a.stream().map(x->x.contains(x)).collect(Collectors.toList());
		
		for(Boolean l:v) {
			System.out.println(l);
		}

		List<String> u=a.stream().filter(x->x.contains("w")).collect(Collectors.toList());
		for(String l:u) {
			System.out.println(l);
		}
		
		List<Integer> n=a.stream().filter(y->y.contains("r")).map(x->x.length()).collect(Collectors.toList());
		for(Integer l:n) {
			System.out.println(l);
		}

		List<String> w=a.stream().map(y->y.toUpperCase()).filter(x->x.contains("W")).collect(Collectors.toList());
		for(String l:w) {
			System.out.println(l);
		}




	}

}
