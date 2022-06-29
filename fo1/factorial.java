package fo1;

public class factorial {
	public static void main(String[] args) {
		int fact=1;
		int num=6;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
			System.out.println("Factorial num "+i+" "+"value"+" "+fact);

		}
		//System.out.println("Factorial num "+num+" "+"value"+" "+fact);
	}

}
