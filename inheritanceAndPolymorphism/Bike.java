package inheritanceAndPolymorphism;

public class Bike extends Cycle {
	public String speed(int a) {
		if(a>60) {
			return "high speed";
			
		}
		else {
			return "low speed";
		}
		
	}
	public static void main(String[] args) {
		Bike b=new Bike();
		b.Pedaling();
		System.out.println(b.name("Honda"));
		System.out.println(b.speed(50));
	}

}
