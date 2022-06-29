package objectArray;

public class UsePen {
	public static void main(String[] args) {
		Pen p1=new Pen();
		Pen p2=new Pen();
		Pen p3=new Pen();
		p1.brand="domsss";
		p1.price=6;
		p1.color="Black";
		p2.brand="cello";
		p2.price=10;
		p2.color="Blue";
		p3.brand="Natraj";
		p3.price=5;
		p3.color="Red";
		Pen[] p= {p1,p2,p3};
		System.out.println(p[0].brand+" "+p[0].price+" "+p[0].color);
		System.out.println(p[1].brand+" "+p[1].price+" "+p[1].color);
		System.out.println(p[2].brand+" "+p[2].price+" "+p[2].color);
		int min=p[0].brand.length();
		String a="";
		String b="";
	    int c=0;
	    int max=0;
		for(Pen d:p) {
		
		
			if(d.brand.length()<min) {
				//min=d.brand.length();
				//a=d.brand;
				//b=d.color;
				
				System.out.println(d.brand+d.price+d.color);
			}
			}
		
//System.out.println(max+" "+a+" "+b);
		}

}
