package DataType;

public class UseStudent {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Prashanthi.M";
		s1.age = 25;
		s1.phoneNo = 9568999052l;
		s1.section = 'A';
		s1.ac = 18776.67899d;
		s1.weight = 50.87f;
		s1.isfemale = true;
		Student s2 = new Student();
		s2.name = "Pavithra.P";
		s2.age = 25;
		s2.phoneNo = 9600105273l;
		s2.section = 'A';
		s2.ac = 2579.775649d;
		s2.weight = 60.32f;
		s2.isfemale = true;
		System.out.println("Name="+s1.name+";Age="+s1.age +";PhoneNo="+s1.phoneNo+";Section="+s1.section+";Ac"+s1.ac+";Weight="+s1.weight+";Female="+s1.isfemale);
		System.out.println("Name="+s2.name+";Age="+s2.age+";PhoneNO="+s2.phoneNo+";Section="+s2.section+";Ac="+s2.ac+";Weight="+s2.weight+";Female="+s2.isfemale);
		
	}
	}


