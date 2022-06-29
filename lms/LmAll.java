package lms;

public class LmAll {
	public static void main(String[] args) {
		String name=args[0];
		int a=Integer.parseInt(args[1]);
		float b=Float.parseFloat(args[2]);
		double c=Double.parseDouble(args[3]);
		long d=Long.parseLong(args[4]);
		boolean e=Boolean.parseBoolean(args[5]);
		System.out.println("Name="+name);
		System.out.println("Age="+a);
		System.out.println("Weight="+b);
		System.out.println("Accoount Balance="+c);
		System.out.println("Mobile No="+d);
		System.out.println("IsFemale "+e);
		
		
	}

}
