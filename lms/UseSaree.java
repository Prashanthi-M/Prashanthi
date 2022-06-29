package lms;

public class UseSaree {
	public static void main(String[] args) {
		Saree saree=new Saree();
		String[] s=args[0].split(",");
		char a=saree.material.charAt(saree.material.length()-1);
		saree.colour=s[1];
		saree.price=Integer.parseInt(s[2]);
		saree.discountPer=Integer.parseInt(s[3]);
		saree.netPrice=saree.price-(saree.price*saree.discountPer/100);
		//System.out.println("MATERIAL-"+saree.material+",COLOUR-"+saree.colour+",NETPRICE-"+saree.netPrice);
		System.out.println(saree.material);
		System.out.println(a);
		
	}
	}


