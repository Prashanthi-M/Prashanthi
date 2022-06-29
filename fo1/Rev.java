package fo1;

public class Rev {
	public static void main(String[] args) {
		String a="Onesoft";
		String total="";
		for(int i=a.length()-1;i>=0;i--) {
			total=total+a.charAt(i);
		}
		System.out.println(total);
	}

}
