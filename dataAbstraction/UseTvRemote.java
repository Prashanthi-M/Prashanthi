package dataAbstraction;

public class UseTvRemote {
	public static void main(String[] args) {
		TvRemote tv=new TvRemote();
		System.out.println(tv.batteryType());
		System.out.println(tv.connectivity());
		System.out.println(tv.onOff("On"));
	}

}
