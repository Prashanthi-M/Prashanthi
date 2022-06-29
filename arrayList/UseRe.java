package arrayList;

import java.util.ArrayList;

public class UseRe {
	public static void main(String[] args) {
		Re c1=new Re("BMW",40000,"XVI","Red");
		Re c2=new Re("Tata",40000,"CVI","Black");
		Re c3=new Re("Benz",60000,"rhdu","White");
		Re c4=new Re("Toyota",30000,"Vi","Red");
		ArrayList<Re> li=new ArrayList<>();
		li.add(c1);
		li.add(c2);
		li.add(c3);
		li.add(c4);
		
		for(int i=0;i<li.size();i++) {
			if(li.get(i).getColor().equalsIgnoreCase("Red")) {
			System.out.println(li);
				
			}
			else {
				System.out.println("invalid");
			}
		}
		
	}

}
