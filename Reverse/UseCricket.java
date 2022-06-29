package Reverse;

public class UseCricket {
	public static void main(String[] args) {
		Cricket cricket1=new Cricket("Dhone",true,300,43,0);
		Cricket cricket2=new Cricket("Sachin",true,200,46,0);
		Cricket cricket3=new Cricket("Rohit",false,250,40,2);
		Cricket cricket4=new Cricket("Virat",false,350,38,4);
		Cricket cricket5=new Cricket("Raina",false,400,35,0);
		int max=0;
		
		Cricket[] cricket= {cricket1,cricket2,cricket3,cricket4,cricket5};
		for(int i=0;i<cricket.length;i++) {
			if(cricket[i].getPlayersScore()>max) {
				max=cricket[i].getPlayersScore();
			}
			
		}
		System.out.println(max);
		
			
		
	}

}
