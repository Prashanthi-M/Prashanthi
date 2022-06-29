package arrayWithForLoop;

public class Rever {
	public static void main(String[] args) {
		String[] a= {"Murali","Anu","Kamala","Gokul","Sam","Vicky","Laxmi","Pavi","Prasha","Renu"};
		for(int i=a.length/2;i<a.length;i++) {
			System.out.println(a[i].toLowerCase());
		}
	}

}



