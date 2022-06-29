package arrayWithForLoop;

public class Woho {
	public static void main(String[] args) {
		String[] a=new String[3];
		a[0]="hari";
		a[1]="hello";
		a[2]="hi";
		for(int i=a.length/2-1;i<a.length;i++) {
			System.out.println(a[i].charAt(a[i].length()-1));
		}
		

}
}