package arrayWithForLoop;

public class Se {
	public static void main(String[] args) {
		String a="Murali,Gokul,David,Anu";
		String[] b=a.split(",");
		for(int i=b.length-1;i>=0;i--) {
			System.out.println(b[i]+" "+"Length is "+b[i].charAt(b[i].length()-1));


}
}
}