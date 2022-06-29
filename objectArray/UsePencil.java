package objectArray;

public class UsePencil {
	public static void main(String[] args) {
		Pencil p1=new Pencil();
		Pencil p2=new Pencil();
		Pencil p3=new Pencil();
		p1.brand="Apsara";
		p1.price=15;
		p1.color="Black";
		p2.brand="Doms";
		p2.price=10;
		p2.color="Red";
		p3.brand="Natraj";
		p3.price=30;
		p3.color="Blue";
		Pencil[] a= {p1,p2,p3};
		int min=a[0].price;
		String b="";
		String c="";
		for(int i=0;i<a.length;i++) {
			if(a[i].price<min) {
				min=a[i].price;
				b=a[i].brand;
				c=a[i].color;
				System.out.println(min+" "+a[i].brand+" "+a[i].color);
				
			}
			
		}
	}

}
