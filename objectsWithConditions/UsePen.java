package objectsWithConditions;

public class UsePen {
	public static void main(String[] args) {
		Pen p1=new Pen();
		p1.brand="Reynolds";
		p1.price=40;
		p1.tax=2;
		p1.netPrice=p1.price+p1.tax;
		Pen p2=new Pen();
		p2.brand="Cello";
		p2.price=45;
		p2.tax=6;
		p2.netPrice=p2.price+p2.tax;
		Pen p3=new Pen();
		p3.brand="NatRaj";
		p3.price=50;
		p3.tax=7;
		p3.netPrice=p3.price+p3.tax;
		char b=p2.brand.charAt(p2.brand.length()-1);
		char c=p3.brand.charAt(p3.brand.length()-1);
		if(p1.brand.charAt(p1.brand.length()-1)=='a') {
			System.out.println(p1.brand+"It is a Vowel");
		}
		else if(p1.brand.charAt(p1.brand.length()-1)=='e') {
			System.out.println(p1.brand+"It is a vowel");
		}
		else if(p1.brand.charAt(p1.brand.length()-1)=='i') {
			System.out.println(p1.brand+"It is a Vowel");
		}
		else if(p1.brand.charAt(p1.brand.length()-1)=='o') {
			System.out.println(p1.brand+"It is a vowel");
		}
		else if(p1.brand.charAt(p1.brand.length()-1)=='u') {
			System.out.println(p1.brand+"It is a vowel");
		}
		else {
			System.out.println(p1.brand+"It is not a vowel");
		}
		if(b=='a'&&b=='e'&&b=='i'&&b=='o'&&b=='u') {
			System.out.println(p2.brand+""+"It is a vowel");
		}
		else {
			System.out.println(p2.brand+" "+"It is a vowel");
		}
		if(c=='a'&&c=='e'&&c=='i'&&c=='o'&&c=='u') {
			System.out.println(p3.brand+" "+"It is a vowel");
		}
		else {
			System.out.println(p3.brand+" "+"It is not a vowel");
		}
			
			
			
			
		
			
		
	}
	}


