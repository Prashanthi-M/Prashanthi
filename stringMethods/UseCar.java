package stringMethods;

public class UseCar {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.brand="Bmw";
		car1.model="XVI";
		car1.price=400000;
		car1.isPetrol=false;
		Car car2=new Car();
		car2.brand="Tata";
		car2.model="IX";
		car2.price=300000;
		car2.isPetrol=true;
		Car car3=new Car();
		car3.brand="Swift";
		car3.model="X2V";
		car3.price=200000;
		car3.isPetrol=true;
		int a=car1.brand.length();
		int b=car2.brand.length();
		int c=car3.brand.length();
		int d=car1.price+car2.price+car3.price/3;
	    String n1=car1.brand.toUpperCase();
	    String n2=car2.brand.toUpperCase();
	    String n3=car3.brand.toUpperCase();
	    System.out.println(n1+" "+car1.model+" "+car1.price+" "+car1.isPetrol);
	    System.out.println(n2+" "+car2.model+" "+car2.price+" "+car2.isPetrol);
	    System.out.println(n3+" "+car3.model+" "+car3.price+" "+car3.isPetrol);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
	}

}
