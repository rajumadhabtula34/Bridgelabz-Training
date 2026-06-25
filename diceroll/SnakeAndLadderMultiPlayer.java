package com.diceroll;

public class SnakeAndLadderMultiPlayer {

	public static final int NO_PLAY=0;
	public static final int SNAKE=1;
	public static final int LADDER=2;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int player=1;
		int position1=0;
		int position2=0;
		while(position1<100&&position2<100) {
			
			
			int option;
			int diceroll;
						
			if(player==1) {
				 diceroll=(int)(Math.random()*6)+1;
				 option=(int)(Math.random()*3);
				
				position1=find(position1,option,diceroll);
				if(option!=LADDER) {
					   player=2;
				}
				if(position1<0) {
					  position1=0;
				}
				  
			}
			else {
				 diceroll=(int)(Math.random()*6)+1;
				 option=(int)(Math.random()*3);
				
				position2=find(position2,option,diceroll);
				if(option!=LADDER) {
					   player=1;
				}
				if(position2<0) {
					  position2=0;
				}
				   
			}
			
				
			
		}
		if(position1>=100) {
			System.out.print("player1 won the game "+position1);
		}
		else {
			System.out.print("player2 won the game "+position2);
			
		}
		
		
		

	}
	public static int find(int position,int option,int diceroll) {
		   
		switch(option) {
		   case 1:
			     position-=diceroll;
			     break;
		   case 2:
			   position+=diceroll;
			   break;
			   
			default:
				break;
		   }
		return position;
		  
			   
	}


}
