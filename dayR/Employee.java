package dayR;

public class Employee {
	private int id;
	private String sec;
	private int no;
	public Employee(int id,String sec,int no) {
		this.id=id;
		this.sec=sec;
		this.no=no;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSec() {
		return sec;
	}
	public void setSec(String sec) {
		this.sec = sec;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String toString() {
		return id+" "+sec+" "+no;
	}
	

}
