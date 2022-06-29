package oops;

public class UseMobile {
	public static void main(String[] args) {
		Processor p=new Processor("xys",5000,150);
		Mobile m1=new Mobile("Samsung",30000,"Xvi",p);
		Mobile m2=new Mobile("Sony",15000,"Vil",p);
		Mobile m3=new Mobile("Realme",25000,"XVII",p);
		Mobile[] m= {m1,m2,m3};
		int max=0;
		String a="";
		
		for(int i=0;i<m.length;i++) {
			if(m[i].getprice()>max) {
				
			
			max=m[i].getprice();
			a=m[i].getbrand();
			}
			
		}
		System.out.println(a+" "+" "+max);
			

}

}
