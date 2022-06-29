package dayR;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import inheritanceAndPolymorphism.Exam;

public class UseExam1 {
	public static void main(String[] args) {
		Exam1 e1=new Exam1(12,"Anu","Java","Female",27);
		Exam1 e2=new Exam1(15,"Kamala","Java","Female",27);
		HashMap<Integer,Exam1> hm=new HashMap<>();
		hm.put(1,e1);
		hm.put(2,e2);
		Map<Object, Object> l=hm.entrySet().stream().filter(z->z.getValue().getAge()>=26).collect(Collectors.toMap(n->n.getKey(),j->j.getValue()));
	}


}
