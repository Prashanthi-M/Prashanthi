package arrayWithForLoop;

public class Spli {
	public static void main(String[] args) {
		String[] a= {"Murali","Anu","David","Gokul"};
		for(int i=0;i<a.length;i=i+2) {
			System.out.println(a[i]);
		}
	}

}
