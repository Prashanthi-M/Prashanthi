package Reverse;

public class StrRev {
	public static void main(String[] args) {
		String name="Onesoft";
		String value="";
		for(int i=name.length()-1;i>=0;i--) {
			value=value+name.charAt(i);
		}
		System.out.println(value);
	}

}
