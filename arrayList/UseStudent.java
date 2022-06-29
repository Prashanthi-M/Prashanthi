package arrayList;

import java.util.ArrayList;

public class UseStudent {
	public static void main(String[] args) {
		Student s1=new Student("Pavi",45,"Female",78,"c");
		Student s2=new Student("kamala",34,"Female",88,"A");
		Student s3=new Student("Anu",56,"Female",49,"A");
		Student s4=new Student("Gokul",65,"Male",49,"B");
		Student s5=new Student("murali",54,"MAle",50,"A");
		Student s6=new Student("Iyappan",77,"MAle",87,"B");
		Student s7=new Student("Laxmi",43,"Female",78,"C");
		Student s8=new Student("Arun",58,"Male",99,"a");
		Student s9=new Student("Sona",76,"Female",56,"c");
		Student s10=new Student("Anupriya",67,"Female",67,"a");
		ArrayList<Student> li=new ArrayList<>();
		li.add(s1);
		li.add(s2);
		li.add(s3);
		li.add(s4);
		li.add(s5);
		li.add(s6);
		li.add(s7);
		li.add(s8);
		li.add(s9);
		li.add(s10);
		ArrayList<Student> femaleli =new ArrayList<>();
		for(Student s:li) {
			if(s.getGender().equalsIgnoreCase("Female")) {
				femaleli.add(s);
			}
		}
		for(Student i:femaleli) {
			System.out.println(i);
			
		}
		ArrayList<Student> si=new ArrayList<>();
		for(int i=0;i<li.size();i++) {
			if(li.get(i).getGender().equalsIgnoreCase("Male")) {
				si.add(li.get(i));
				
			}
		}
		for(Student b:si) {
			System.out.println(b);
		}
		li.forEach((x)->{ if(x.getMark()>75) {
			System.out.println(x);
		}
		});
		
		
	}

}
