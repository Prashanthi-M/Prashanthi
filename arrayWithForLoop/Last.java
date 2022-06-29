package arrayWithForLoop;

public class Last {
 public static void main(String[] args) {
	String[] a = {"Hai","Hello","good"};
	for(int i=a.length-1;i>=0;i--) {
		System.out.println(a[i].charAt(a[i].length()-1));


	}
 }
}
