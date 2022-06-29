package arrayList;

public class Student1 {
	private String name;
	private int std;
	private int id;
	
	public Student1(String name,int std,int id) {
		this.name=name;
		this.std=std;
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String toString(String name,int std,int id) {
		return name+" "+std+" "+id;
	}

}
