package arrayWithForLoop;

public class Lawo {
	public static void main(String[] args) {
		String a = "vinu,vibu,vicky" ;
		String[] b=a.split(",");
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i].charAt(b[i].length()-1));

}
}
}