package Reverse;

public class Number {
	
		  public static void main(String[] args) {
		    int num=1987;
		    int num1=0;
		    while(num>0) {
		      int remainder=num%10;
		      num1=num1+remainder;
		      num=num/10;
		    }
		      System.out.println(num1);
		    }
		}


