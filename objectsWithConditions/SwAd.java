package objectsWithConditions;

public class SwAd {
	public static void main(String[] args) {
		int num1=5;
		int num2=5;
		String operation="Div";
		switch(operation) {
		case "Add": System.out.println(num1+num2);
		break;
		case "Mul" : System.out.println(num1*num2);
		break;
		case "Sub":System.out.println(num1-num2);
		break;
		case "Div":System.out.println(num1/num2);
		break;
		case "Mod":System.out.println(num1%num2);
		break;
		default: System.out.println("None");
		
		}
	}
	}


