package objectArrayUsingForLoop;

public class UseBag {
 public static void main(String[] args) {
	  Bag b1=new Bag();
	  String[] a=args[0].split(",");
	  b1.brand=a[0];
	  b1.color=a[1];
	  b1.price=Integer.parseInt(a[2]);
	  Bag b2=new Bag();
	  String[] b=args[1].split(",");
	  b2.brand=b[0];
	  b2.color=b[1];
	  b2.price=Integer.parseInt(b[2]);
	  Bag b3=new Bag();
	  String[] c=args[2].split(",");
	  b3.brand=c[0];
	  b3.color=c[1];
	  b3.price=Integer.parseInt(c[2]);
	  Bag[] d= {b1,b2,b3};
	  for(int i=0;i<d.length;i++) {
		  System.out.println(d[i].brand+" "+d[i].color+" "+d[i].price);
	  }


	}

}
