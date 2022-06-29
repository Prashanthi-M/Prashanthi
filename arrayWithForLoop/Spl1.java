package arrayWithForLoop;

public class Spl1 {
	public static void main(String[] args) {
		String a="Murali,Gokul,David,Anu";
		String[] b=a.split(",");
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}

}
