package inheritanceAndPolymorphism;

public class Keypad extends Landline  {
public void text() {
	System.out.println("Text");

}
public static void main(String[] args) {
	Keypad k=new Keypad();
	k.call();
	k.text();
}


}