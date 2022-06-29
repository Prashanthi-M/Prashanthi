package objects;

public class UsePen {
	public static void main(String[] args) {
		Pen p1=new Pen();
		p1.brand="Natraj";
		p1.price=10;
		p1.isBlueColor=true;
		p1.tipWidth=0.5f;
		Pen p2=new Pen();
		p2.brand="Cello";
		p2.price=20;
		p2.isBlueColor=false;
		p2.tipWidth=0.6f;
		Pen p3=new Pen();
		p3.brand="Renolds";
		p3.price=15;
		p3.isBlueColor=false;
		p3.tipWidth=0.7f;
		System.out.println("The Average value is "+((p1.price+p2.price+p3.price)/3));
		
		
	}
}