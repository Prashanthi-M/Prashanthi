package inheritanceAndPolymorphism;

public class Exam {

	public int marks(int che,int maths) {
		return maths+che;
	}
	public int marks(int che,int maths,int eng) {
		return maths+che+eng;
	}
public static void main(String[] args) {
	Exam e=new Exam();
	System.out.println(e.marks(70,80));
	System.out.println(e.marks(70,90,70));
}

}
