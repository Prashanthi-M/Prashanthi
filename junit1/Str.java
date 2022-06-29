package junit1;

public class Str {
	
	String name;
	String name1;
	String name2;
	public Str(String name,String name1,String name2) {
		this.name=name;
		this.name1=name1;
		this.name2=name2;
	}
	public String length() {
		if(name.length()>name1.length()&&name.length()>name2.length()) {
			return name;
		}
		else if(name1.length()>name.length()&&name1.length()>name2.length()) {
			return name1;
		}
		else if(name2.length()>name.length()&&name2.length()>name1.length()) {
			return name2;
			
		}
		else {
			return "Failed";
		}
	}
	


}
