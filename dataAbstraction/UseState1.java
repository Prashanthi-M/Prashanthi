package dataAbstraction;

public class UseState1 {
	public static void main(String[] args) {
		State1 s=new State1();
		System.out.println(s.stateCode("TN"));
		System.out.println(s.noPlateColor("Green&White"));
	}

}
