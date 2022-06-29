package hashMap;



public class Student {
	String name;
	int id;
	boolean isPass;
	
	public void setname(String name) {
		this.name=name;
	}
	public void setid(int id) {
		this.id=id;
	}
	public void setisPass(boolean isPass) {
		this.isPass=isPass;
	}
	public String getname() {
		return this.name;
	}
	public int getid() {
		return this.id;
	}
	public boolean getisPass() {
		return this.isPass;
	}
	public String toString() {
		return name+" "+id+" "+isPass;
		
	}
	
	
		
	}

