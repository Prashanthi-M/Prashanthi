package lms;

public class UseStudent {
	public static void main(String[] args) {
		Student a=new Student();
		a.name=args[0];
		a.rollNo=Integer.parseInt(args[1]);
		a.aadharNo=Long.parseLong(args[2]);
		a.percentage=Float.parseFloat(args[3]);
		a.isItGood=Boolean.parseBoolean(args[4]);
		System.out.println("Name="+a.name+" RollNo="+a.rollNo+" AaharNo="+a.aadharNo+" Percentage="+a.percentage+"%"+" "+a.isItGood);
		
		
		
		
	}
	}


