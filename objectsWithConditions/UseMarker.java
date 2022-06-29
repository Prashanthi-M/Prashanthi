package objectsWithConditions;

public class UseMarker {
	public static void main(String[] args) {
		Marker m1=new Marker();
		m1.brand="Reynolds";
		m1.price=50;
		m1.color="Black";
		m1.isWriting=true;
		int len=m1.brand.length();
		Marker m2=new Marker();
		m2.brand="Cello";
		m2.price=70;
		m2.color="Red";
		m2.isWriting=false;
		int len1=m2.brand.length();
		Marker m3=new Marker();
		m3.brand="Parker";
		m3.price=100;
		m3.color="Green";
		m3.isWriting=true;
		int len2=m3.brand.length();
		int dis =10;
		if(m1.price>50) {
			System.out.println(m1.brand+" The discount price is "+(m1.price-(m1.price*dis/100)));
		} 
		
		 if(m2.price>50) {
			System.out.println(m2.brand+" The discount price is "+(m2.price-(m2.price*dis/100)));
		}
		 if(m3.price>50) {
			System.out.println(m3.brand+" The discount price is "+(m3.price-(m3.price*dis/100)));
		}
		else {
			System.out.println("There is no discount ");
		}
			
	}
	}

