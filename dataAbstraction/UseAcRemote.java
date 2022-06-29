package dataAbstraction;

public class UseAcRemote {
	public static void main(String[] args) {
		AcRemote ac=new AcRemote();
		System.out.println(ac.batteryType());
		System.out.println(ac.connectivity());
        System.out.println(ac.onOff("on"));
		
	}

}
