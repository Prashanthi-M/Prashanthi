package oops;

public class UseCar {
	public static void main(String[] args) {
		Engine e=new Engine();
		e.setbrand("Volkswagon");
		e.setprice(50000);
		e.sethp(150);
		Car c1=new Car();
		c1.setbrand("Swift");
		c1.setprice(400000);
		c1.setcolor("Blue");
		c1.setengine(e);
		System.out.println(c1.getbrand()+" "+c1.getprice()+" "+c1.getcolor()+" "+c1.getengine().getbrand()+" "+c1.getengine().getprice()+" "+c1.getengine().gethp());
		Engine e1=new Engine();
		e1.setbrand("Volks");
		e1.setprice(48000);
		e1.sethp(100);
		Car c2=new Car();
		c2.setbrand("Benz");
		c2.setprice(500000);
		c2.setcolor("Black");
		c2.setengine(e1);
		System.out.println(c2.getbrand()+" "+c2.getprice()+" "+c2.getcolor()+" "+c2.getengine().getbrand()+" "+c2.getengine().getprice()+" "+c2.getengine().gethp());
		Car c3=new Car();
		c3.setbrand("Tata");
		c3.setprice(300000);
		c3.setcolor("Black");
		c3.setengine(e);
		System.out.println(c3.getbrand()+" "+c3.getprice()+" "+c2.getcolor()+" "+c3.getengine().getbrand()+" "+c3.getengine().getprice()+" "+c2.getengine().gethp());
		//System.out.println(c1.carDetails());
		//System.out.println(c2.carDetails());
		//System.out.println(c3.carDetails());
		
		Car[] d= {c1,c2,c3};
		//int total=0;
		//for(int i=0;i<d.length;i++) {
			//total=total+d[i].getprice;
			
	//	}
	//	System.out.println(total);
		int max=0;
		String a="";
		String b="";
		int price=0;
		int hp=0;
		String f="";
		

		
		for(int i=0;i<d.length;i++) {
			if(d[i].getprice()>max) {
				max=d[i].getprice();
				a=d[i].getbrand();
				b=d[i].getcolor();
				f=d[i].getengine().getbrand();
				price=d[i].getengine().getprice();
				hp=d[i].getengine().gethp();
			}
		}
		System.out.println(max+" "+a+" "+b+" "+f+" "+price+" "+hp);
			
		
		
	}

}
