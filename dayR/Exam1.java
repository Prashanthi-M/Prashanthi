package dayR;

public class Exam1 {
	private int id;
	private String name;
	private String course;
	private String gender;
	private int age;
	public Exam1(int id,String name,String course,String gender,int age) {
		this.id=id;
		this.name=name;
		this.course=course;
		this.gender=gender;
		this.age=age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
