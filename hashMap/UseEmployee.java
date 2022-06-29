package hashMap;

import java.util.HashMap;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e1=new Employee("Anu",28000,false,"Female");
		Employee e2=new Employee("Kamala",15000,true,"Female");
		Employee e3=new Employee("Gokul",45000,false,"Male");
		HashMap<Integer,Employee> hm=new HashMap<>();
		hm.put(101, e1);
		hm.put(298, e2);
		hm.put(234, e3);
	    System.out.println(hm);
		for(Integer i:hm.keySet()) {
			System.out.println(i);
		}
		int count=0;
		for(Employee e:hm.values()) {
			if(e.getisMarried()==true) {
				count++;
			}
		}
		System.out.println(count);
		int max=0;
	    for(Employee e:hm.values()) {
		if(e.getsalary()>max) {
			System.out.println(e);
			
		}
			
			
		}
	    int min=e1.getsalary();
	    for(Employee e:hm.values()) {
	    	if(e.getsalary()<min) {
	    		System.out.println(e);
	    	}
	    }
	    for(Employee e:hm.values()) {
	    	if(e.getsalary()>20000&&e.getsalary()<=30000&&e.getgender().equalsIgnoreCase("female")) {
	    		System.out.println(e);
	    		
	    	}
	    }
	    for(Employee e:hm.values()) {
	    	if(e.getgender().equalsIgnoreCase("female")) {
	    		System.out.println(e.getname());
	    	}
	    }
			
		}
			
		}


