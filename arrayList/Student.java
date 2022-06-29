package arrayList;

public class Student {
	private String name;
	private int id;
	private String gender;
	private int mark;
	private String sec;
	public Student(String name,int id,String gender,int mark,String sec) {
		this.name=name;
		this.id=id;
		this.gender=gender;
		this.mark=mark;
		this.sec=sec;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public String getSec() {
		return sec;
	}
	public void setSec(String sec) {
		this.sec = sec;
	}
public String toString() {
	return name+" "+id+" "+gender+" "+mark+" "+sec;
}
}
