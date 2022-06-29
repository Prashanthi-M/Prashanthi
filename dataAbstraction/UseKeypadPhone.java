package dataAbstraction;

public class UseKeypadPhone {
	public static void main(String[] args) {
		KeypadPhone kp=new KeypadPhone();
		System.out.println(kp.network("2G LTE Network"));
		System.out.println(kp.camera("16 mp "));
		KeypadPhone kp1=new KeypadPhone();
		kp1.brand="Samsung";
		kp1.color="Grey";
		kp1.price=10000;
		KeypadPhone kp2=new KeypadPhone();
		kp2.brand="Nokia";
		kp2.color="Black";
		kp2.price=5000;
		KeypadPhone kp3=new KeypadPhone();
		kp3.brand="Lava";
		kp3.color="White";
		kp3.price=6000;
		System.out.println(kp1.brand+" "+kp1.color+" "+kp1.price);
		System.out.println(kp2.brand+" "+kp2.color+" "+kp2.price);
		System.out.println(kp3.brand+" "+kp3.color+" "+kp3.price);
		
		
	}
}
