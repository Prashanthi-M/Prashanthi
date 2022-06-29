package objectArrayUsingForLoop;

public class UseMobile {
 public static void main(String[] args) {
	  Mobile m1=new Mobile();
	  String[] a=args[0].split(",");
	  m1.brand=a[0];
	  m1.color=a[1];
	  m1.price=Integer.parseInt(a[2]);
	  Mobile m2=new Mobile();
	  String[] b=args[1].split(",");
	  m2.brand=b[0];
	  m2.color=b[1];
	  m2.price=Integer.parseInt(b[2]);
	  Mobile m3=new Mobile();
	  String[] c=args[2].split(",");
	  m3.brand=c[0];
	  m3.color=c[1];
	  m3.price=Integer.parseInt(c[2]);
	  Mobile[] d= {m1,m2,m3};
	  int count=0;
	  for(int i=0;i<d.length;i++) {
		  //System.out.println(d[i].brand.toUpperCase()+" "+d[i].color.toLowerCase()+" "+d[i].price);
		  count=count+d[i].price;
	  }
System.out.println(count);


	}

}
