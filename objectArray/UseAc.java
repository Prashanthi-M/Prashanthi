package objectArray;

public class UseAc {
	public static void main(String[] args) {
		Ac ac1=new Ac();
		Ac ac2=new Ac();
		Ac ac3=new Ac();
		ac1.brand="Samsung";
		ac1.price=25000;
		ac1.rating=4.6f;
		ac2.brand="kenley";
		ac2.price=28000;
		ac2.rating=4.2f;
		ac3.brand="Sony";
		ac3.price=29000;
		ac3.rating=4.8f;
		Ac[] a= {ac1,ac2,ac3};
		System.out.println(a[0].brand+" "+a[0].price+" "+a[0].rating);
		System.out.println(a[1].brand+" "+a[1].price+" "+a[1].rating);
		System.out.println(a[2].brand+" "+a[2].price+" "+a[2].rating);
		for(int i=0;i<a.length;i++) {
			if(a[i].brand=="a"||a[i].brand=="e"||a[i].brand=="i"||a[i].brand=="o"||a[i].brand=="u") {
				System.out.println("vowels");
			}
			else {
				System.out.println("not vowels");
			}
			
		}
	}
}
