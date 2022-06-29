package arrayList;

import java.util.ArrayList;

public class UseStudent1 {
	public static void main(String[] args) {
		Student1 s1=new Student1("PAvi",10,45);
		Student1 s2=new Student1("Sona",10,46);
		Student1 s3=new Student1("Anu",10,43);
		Student1 s4=new Student1("Renu",10,34);
		ArrayList<Student1> s=new ArrayList<>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		ArrayList<Student1> d=new ArrayList<>();
		for(Student1 e:s) {
			if(e.getName().charAt(0)>='a'&&e.getName().charAt(0)<'h') {
				d.add(e);
				
			}
		for(Student1 f:d) {
			
		
			if(f.getName().charAt(0)>='h'&&f.getName().charAt(0)<'s') {
				d.add(f);
			}
			
			for(Student1 k:d) {
				if(k.getName().charAt(0)>='s'&&k.getName().charAt(0)<'z') {
					d.add(k);
				}
				
			}
		}
		}
		System.out.println(d);
		
	}


	}

