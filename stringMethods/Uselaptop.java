package stringMethods;

public class Uselaptop {
	public static void main(String[] args) {
		Laptop lap1=new Laptop();
		lap1.brand="Dell";
		lap1.price=35000;
		lap1.color="Grey";
		lap1.isWarranty=true;
		char s=lap1.color.charAt(2);
		String name=lap1.brand.toUpperCase();
		int l=lap1.brand.length();
		boolean n1=lap1.brand.startsWith("D");
		char c=lap1.brand.charAt(lap1.brand.length()-1);
		String n=lap1.color.toLowerCase();
		System.out.println(name+" "+l+" "+n1+" "+c+" "+n+" "+s);
		
	}
}
