package hashMap;

import java.util.HashMap;

public class UseStudent {

	public static void main(String[] args) {
		Student s=new Student();
		s.name="Anu";
		s.id=34;
		s.isPass=true;
		Student s1=new Student();
		s1.name="Kamala";
		s1.id=16;
		s1.isPass=true;
		Student s2=new Student();
		s2.name="Pavi";
		s2.id=35;
		s2.isPass=false;
		HashMap<Integer,Student> st=new HashMap<>();
		st.put(34,s);
		st.put(16,s1);
		st.put(35,s2);
		System.out.println(st);
		for(Integer i:st.keySet()) {
			System.out.println(i);
			
		}
		for(Student g:st.values()) {
			System.out.println(g);
		}
		
		
		

	}
}
