package hashMap;

public class Employee {
	String name;
	int salary;
	boolean isMarried;
	String gender;
	public Employee(String name,int salary,boolean isMarried,String gender) {
		this.name=name;
		this.salary=salary;
		this.isMarried=isMarried;
		this.gender=gender;
	}
	
	public void setname(String name) {
		this.name=name;
	}
	public void setsalary(int salary) {
		this.salary=salary;
	}
	public void setisMarried(boolean isMarried) {
		this.isMarried=isMarried;
	}
	public void setgender(String gender) {
		this.gender=gender;
	}
	public String getname() {
		return this.name;
		
	}
	public int getsalary() {
		return this.salary;
		
	}
	public boolean getisMarried() {
		return this.isMarried;
	}
	public String getgender() {
		return this.gender;
	}
	public String toString() {
		return name+" "+salary+" "+isMarried+" "+gender;
	}

}
