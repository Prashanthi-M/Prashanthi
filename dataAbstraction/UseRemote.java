package dataAbstraction;

public class UseRemote {
	public static void main(String[] args) {
		AcRemote ac=new AcRemote();
		System.out.println(ac.batteryType());
		System.out.println(ac.connectivity());
		System.out.println(ac.onOff("On"));
		TvRemote tv=new TvRemote();
		System.out.println(tv.batteryType());
		System.out.println(tv.connectivity());
		System.out.println(tv.onOff("On"));
		
	}

}
