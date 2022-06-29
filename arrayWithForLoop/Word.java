package arrayWithForLoop;

public class Word {
	public static void main(String[] args) {
		String[] a = {"meena","mary","maize"};
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i].charAt(a[i].length()-1));

}
}
}