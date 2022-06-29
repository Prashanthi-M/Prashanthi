package objectArrayUsingForLoop;

public class UsePen {
	public static void main(String[] args) {
		 Pen p1=new Pen();
		String[] a=args[0].split(",");
		//String d=a[0];
	   
	    p1.brand=a[0];
	     p1.price=Integer.parseInt(a[1]);
	   // int b=price;
	    p1.color=a[2];
	    Pen p2=new Pen();
	    String[] b=args[1].split(",");
	    p2.brand=b[0];
	    p1.price=Integer.parseInt(b[1]);
	    //int c=price1;
	    p2.color=b[2];
	    Pen p3=new Pen();
	    String[] c=args[2].split(",");
	    p3.brand=c[0];
	    p3.price=Integer.parseInt(c[1]);
	    //int f=price2;
	    p3.color=c[2];
	    Pen[] d= {p1,p2,p3};
	    for(int i=0;i<d.length;i++) {
	    	System.out.println(d[i].brand+" "+d[i].price+" "+d[i].color);
	    }
	    
	    
	    
		
	}
	

	

}
