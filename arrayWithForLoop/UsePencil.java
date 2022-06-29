package arrayWithForLoop;

public class UsePencil {
	public static void main(String[] args) {
		Pencil p1=new Pencil();
		p1.brand="Natraj";
		p1.price=10;
		p1.color="Black";
		Pencil p2=new Pencil();
		p2.brand="Doms";
		p2.price=5;
		p2.color="Green";
		Pencil p3=new Pencil();
		p3.brand="Apsara";
		p3.price=15;
		p3.color="Blue";
		Pencil[] a= {p1,p2,p3};
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i].brand+" "+a[i].price+" "+a[i].color);
			
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i].color.toUpperCase());
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i].brand.length());
		}
		for(int i=0;i<a.length;i++) {
			System.out.println("Natraj is equals to doms is "+a[0].brand.equals(a[1]));
			
		}
		
		
		
	}
	}


