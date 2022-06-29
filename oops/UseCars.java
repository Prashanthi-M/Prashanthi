package oops;

public class UseCars {
	public static void main(String[] args) {
		Cars c1=new Cars();
		c1.setprice(400000);
		c1.setbrand("Benz");
		c1.setcolor("Blue");
		Cars c2=new Cars();
		c2.setprice(500000);
		c2.setbrand("Suzuki");
		c2.setcolor("Black");
		System.out.println(c1.getprice());
		System.out.println(c1.getbrand());
		System.out.println(c1.getcolor());
		System.out.println(c2.getprice()+" "+c2.getbrand()+" "+c2.getcolor());
		
		
				
	}

}
