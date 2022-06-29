package arrayList;

import java.util.ArrayList;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e1=new Employee("Pavi",574,26,"female",26000);
		Employee e2=new Employee("Kamala",575,27,"female",30000);
		Employee e3=new Employee("Anu",576,27,"female",30000);
		Employee e4=new Employee("Gokul",577,22,"Male",45000);
		Employee e5=new Employee("udjk",788,34,"Female",34000);
		Employee e6=new Employee("k",738,32,"Female",43000);
		Employee e7=new Employee("jk",798,34,"male",34000);
		Employee e8=new Employee("udjko",748,32,"male",43000);
		Employee e9=new Employee("udjkmn",789,37,"Female",34000);
		Employee e10=new Employee("udjko",768,34,"male",45000);
		ArrayList<Employee> e=new ArrayList<>();
		e.add(e1);
		e.add(e2);
		e.add(e3);
		e.add(e4);
		e.add(e5);
		e.add(e6);
		e.add(e7);
		e.add(e8);
		e.add(e9);
		e.add(e10);
		e.forEach((x)->System.out.println(x));
		for(Employee i:e) {
			if(i.getsalary()>40000) {
				System.out.println(i);
				
			}
			e.forEach((x)->{ if(x.getgender().equalsIgnoreCase("Male")) {
				System.out.println(x);
			}
			});
			
			
			
			}
				
			}
		
		

		
		
		
		
		
	}


