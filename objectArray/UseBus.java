package objectArray;

public class UseBus {
	public static void main(String[] args) {
		Bus b1=new Bus();
		Bus b2=new Bus();
		Bus b3=new Bus();
		b1.brand="RedBus";
		b1.noOfSeats=30;
		b2.brand="RJ";
		b2.noOfSeats=50;
		b3.brand="Gov";
		b3.noOfSeats=80;
		Bus[] c= {b1,b2,b3};
		System.out.println(c[0].brand+" "+c[0].noOfSeats);
		System.out.println(c[1].brand+" "+c[1].noOfSeats);
		System.out.println(c[2].brand+" "+c[2].noOfSeats);
		int max=0;
		String e="";
		for(Bus d:c) {
			if(d.noOfSeats>50) {
				max=d.noOfSeats;
				e=d.brand;
				
				
			}
			
		}
		System.out.println(max+" "+e);

	}

}
