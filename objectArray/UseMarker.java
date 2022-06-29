package objectArray;

public class UseMarker {
	public static void main(String[] args) {
		Marker m1=new Marker();
		Marker m2=new Marker();
		Marker m3=new Marker();
		m1.brand="Cello";
		m1.price=80;
		m1.color="Red";
		m2.brand="Reynolds";
		m2.price=65;
		m2.color="Black";
		m3.brand="Hp";
		m3.price=34;
		m3.color="Blue";
		Marker[] a= {m1,m2,m3};
		int max=0;
		String b="";
		String c="";
		int d=0;
		for(int i=0;i<a.length;i++) {
			if(a[i].brand.length()>max) {
				max=a[i].brand.length();
				b=a[i].brand;
				c=a[i].color;
				d=a[i].price;
				
			}
		}
		System.out.println(b+" "+c+" "+d);
		
	}

}
