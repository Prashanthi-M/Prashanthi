package objects;

 
	public class UseStudent {
		public static void main(String[] args) {
		Student s1 = new Student();
		s1.name="Siva";
		s1.id=234;
		s1.age=14;
		s1.clas="IX";
		s1.attendancePercentage=75;
		s1.numberOfDaysPresentinSchool= (s1.attendancePercentage*240)/100;
		Student s2= new Student();
		s2.name="Mani";
		s2.id=236;
		s2.age=15;
		s2.clas="X";
		s2.attendancePercentage=80;
		s2.numberOfDaysPresentinSchool=(s2.attendancePercentage*240)/100;
		Student s3= new Student();
		s3.name="Valli";
		s3.id=237;
		s3.age=13;
		s3.clas="VIII";
		s3.attendancePercentage=90;
		s3.numberOfDaysPresentinSchool=(s3.attendancePercentage*240)/100;
		System.out.println("NAME="+s1.name+";ID="+s1.id+";Age="+s1.age+";CLASS="+s1.clas+";ATTENDANCE PERCENTAGE="+s1.attendancePercentage+"%"+ ";Number of Days Present in School="+s1.numberOfDaysPresentinSchool);
		System.out.println("NAME="+s2.name+";ID="+s2.id+";Age="+s2.age+";CLASS="+s2.clas+";Attendance percentage="+s2.attendancePercentage+"%"+";Number of days present in school="+s2.numberOfDaysPresentinSchool);
		System.out.println("Name="+s3.name+";id="+s3.id+";age="+s3.age+";class="+s3.clas+";Attendance percentage="+s3.attendancePercentage+"%"+";Number of days present in school="+s3.numberOfDaysPresentinSchool);
		
	}
	}


