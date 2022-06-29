package lms;

public class LMCom {
	public static void main(String[] args) {
		String[] g=args[0].split(",");
		String name=g[0];
		int a=Integer.parseInt(g[1]);
		float b=Float.parseFloat(g[2]);
		long c=Long.parseLong(g[3]);
		double d=Double.parseDouble(g[4]);
		boolean e=Boolean.parseBoolean(g[5]);
		System.out.println(name);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		}

}
