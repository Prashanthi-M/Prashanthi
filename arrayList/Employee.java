package arrayList;

public class Employee {
	private String name;
	private int id;
	private int age;
	private String gender;
	private int salary;
	public Employee(String name,int id,int age,String gender,int salary) {
	    this.name=name;
		this.id=id;
		this.age=age;
		this.gender=gender;
		this.salary=salary;
	}
	public String setname(String name) {
		return this.name=name;
	}
	public int setid(int id) {
		return this.id=id;
	}
	public int setage(int age) {
		return this.age=age;
	}
	public String setgender(boolean gender) {
		return this.gender="gender";
	}
	public int setsalary(int salary) {
		return this.salary=salary;
	}
	public String getname() {
		return this.name;
	}
	public int getid() {
		return this.id;
	}
	public int getage() {
		return this.age;
	}
	public String getgender() {
		return this.gender;
	}
	public int getsalary() {
		return this.salary;
	}
	
	public String toString() {
		return name+" "+id+" "+age+" "+gender+" "+salary;
	}
		
	
		
		
		
	}


