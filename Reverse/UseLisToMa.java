package Reverse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UseLisToMa {
	public static void main(String[] args) {
		ArrayList<LisToMa> ar=new ArrayList<>();
		ar.add(new LisToMa("Sun","Var"));
		ar.add(new LisToMa("Fun","War"));
		Map<String,String> value=new HashMap<>();
		for(LisToMa a:ar) {
			value.put(a.getName(), a.getCode());
		}
		System.out.println(ar);
		System.out.println(value);
	}

}
