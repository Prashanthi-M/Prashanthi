package stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;


public class UseCar {
	public static void main(String[] args) {
		Car c1=new Car("Kia",8000,"red");
		Car c2=new Car("verna",14000,"white");
		Car c3=new Car("creta",13000,"Yellow");
		Car c4=new Car("swift",5000,"blue");
		ArrayList<Car> c=new ArrayList<>();
		c.add(c1);
		c.add(c2);
		c.add(c3);
		c.add(c4);
		List<String> h=c.stream().filter(x->x.getPrice()>10000&&x.getBrand().endsWith("a")).map(s->s.getBrand().substring(1,s.getBrand().length()-1)).collect(Collectors.toList());
		for(String a:h) {
			System.out.println(a);
		}
		List<Car> n=c.stream().filter(y->y.getPrice()>10000&&y.getBrand().endsWith("a")).collect(Collectors.toList());
		
	n.forEach(y->System.out.println(y.getBrand().substring(1,y.getBrand().length()-1)));
		
		
		
		List<Car> g=c.stream().filter(x->x.getColor().contains("e")).collect(Collectors.toList());
		for(Car d:g) {
			if(d.getBrand().contains("a")||d.getBrand().contains("e")||d.getBrand().contains("i")||d.getBrand().contains("o")||d.getBrand().contains("u")) {
			System.out.println(d.getBrand()+" is vowel");
			}
			else {;
				System.out.println(d.getBrand()+" is not a vowel");
			}
		}
		
		List<Integer> j=c.stream().filter(z->z.getBrand().contains("a")&&z.getColor().contains("e")).map(z1->z1.getPrice()+z1.getPrice()*10/100).collect(Collectors.toList());
		
			j.forEach(z1->System.out.println(z1));
		
	
	int total=0;
	for(Car v:c) {
		total=total+v.getPrice();
	}
System.out.println(total);

List<Car> d=c.stream().filter(a->a.getPrice()>10000).collect(Collectors.toList());
int per=0;
for(Car f:d) {
	per=(f.getPrice()*100)/total;
	

System.out.println(per);
		
}

long l=c.stream().count();
System.out.println(l);

long l1=c.stream().filter(x1->x1.getPrice()<10000).count();
System.out.println(l1);
	
long l2=c.stream().map(x2->x2.getPrice()<10000).count();
System.out.println(l2);

long l3=c.stream().filter(x3->x3.getPrice()<10000).map(x4->x4.getPrice()<10000).count();
System.out.println(l3);
}
		
		
	}


