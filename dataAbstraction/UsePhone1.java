package dataAbstraction;

public class UsePhone1 {
	public static void main(String[] args) {
		Phone1 p=new Phone1();
		System.out.println(p.sim1());
		System.out.println(p.sim2());
		Phone1 p1=new Phone1();
		p1.price=500;
		p1.speed="50kb/sec";
		Phone1 p2=new Phone1();
		p2.price=1000;
		p2.speed="30kb/sec";
		System.out.println(p1.price+" "+p1.speed+" "+p.sim1());
		System.out.println(p2.price+" "+p2.speed+" "+p.sim2());
	}

}
