package arrayWithForLoop;

public class UseAirCond1 {
	public static void main(String[] args) {
		AirCond ac1=new AirCond();
		String[] a=args[0].split(",");
		ac1.brand=a[0];
		ac1.price=Integer.parseInt(a[1]);
		//ac1.discountprice=a[2];
		AirCond ac2=new AirCond();
		String[] b=args[1].split(",");
		ac2.brand=b[0];
		ac2.price=Integer.parseInt(b[1]);
		//ac2.discountprice=b[2];
		AirCond ac3=new AirCond();
		String[] c=args[2].split(",");
		ac3.brand=c[0];
		ac3.price=Integer.parseInt(c[1]);
		//ac3.discountprice=c[2];
		int count =0;
		int discountprice=50;
	
		AirCond[] d= {ac1,ac2,ac3};
		for(int i=0;i<d.length;i++) {
		 count=count+d[i].price-(d[i].price*d[i].discountprice/100);
		 
			System.out.println(count);

		}
		//System.out.println(disprice);
		

		
		

		
	}

}
