package oops;

public class UsePen {
	public static void main(String[] args) {
		Ink i=new Ink("Brill","Blue","25Dec2023");
		Pen p1=new Pen("Reynolds",50,i);
		Pen p2=new Pen("Cello",23,i);
		Pen p3= new Pen("Natraj",45,i);
		Pen p4=new Pen("Doms",30,i);
		Pen[] p= {p1,p2,p3,p4};
		for(Pen d:p) {
			System.out.println(d);
		}
	}

}
