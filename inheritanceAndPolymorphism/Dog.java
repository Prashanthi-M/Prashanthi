package inheritanceAndPolymorphism;

public class Dog  extends Cat {
	public String bark() {
		return "Bow";
	}
		public void show() {
			System.out.println(super.bark());
		}
		
	
	public static void main(String[] args) {
		Dog d=new Dog();
		System.out.println(d.bark());
		System.out.println(d.bark());
		d.show();
	}

}
