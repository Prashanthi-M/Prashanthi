package inheritanceAndPolymorphism;

public class Ac extends Fan  {
	public String cooling(int temp) {
		if(temp<20) {
			return "High speed";
			
		}
		else if(temp>=20&&temp<25) {
			return "medium speed";
			
		}
		else if(temp>=25&&temp<30) {
			return "low speed";
		}
		else {
			return "Switch off";
		}
	}
	public static void main(String[] args) {
		Ac a=new Ac();
		System.out.println(a.speed(4));
		System.out.println(a.cooling(30));
	}

}
