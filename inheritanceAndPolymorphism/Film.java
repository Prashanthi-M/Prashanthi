package inheritanceAndPolymorphism;

public class Film {
	public String movie(int rating) {
		if(rating>4) {
			return "Extraordinary";
			
		}
		else if(rating>=4&&rating<3) {
			return "Ordinary";
		}
		else if(rating>=3&&rating<2) {
			return "Normal";
		}
		else {
			return "Worst";
		}
	}
		public String movie(String a) {
			if(a.equals("Gilli")) {
				return "Same name";
				
			}
			else {
				return "Different name";
			}
		}
		public static void main(String[] args) {
			Film f=new Film();
			System.out.println(f.movie(4));
			System.out.println(f.movie("Gilli"));
		}
		
	}
	


