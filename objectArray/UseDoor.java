package objectArray;

public class UseDoor {
	public static void main(String[] args) {
		Door d1=new Door();
		Door d2=new Door();
		Door d3=new Door();
		d1.color="Brown";
		d1.price=12000;
		d1.isWoodmaterial=true;
		
		d2.color="Blue";
		d2.price=14000;
		d2.isWoodmaterial=false;
		
		d3.color="red";
		d3.price=8000;
		d3.isWoodmaterial=false;
		
		Door[] a= {d1,d2,d3};
		
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i].price>max) {
				max=a[i].price;
			}
		}
				System.out.println(max);
	}

}
