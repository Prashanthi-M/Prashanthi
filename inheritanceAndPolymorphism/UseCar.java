package inheritanceAndPolymorphism;

public class UseCar extends Car  { 
	public int price(int a,int b) {
		return a-b;
	}
	public void show() {
		System.out.println(super.price(4000, 2000));
	}
	public static void main(String[] args) {
		UseCar c=new UseCar();
		System.out.println(c.price(4000, 2000));
		//System.out.println(c.price(4000, 2000));
		c.show();
	}

}
