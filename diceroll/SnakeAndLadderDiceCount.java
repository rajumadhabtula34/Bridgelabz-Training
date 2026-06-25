package com.diceroll;

public class SnakeAndLadderDiceCount {
	public static final int NO_PLAY=0;
	public static final int SNAKE=2;
	public static final int LADDER=1;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int position=0;
		int dicecount=0;
		while(position<100) {
			 dicecount++;
			
			int diceroll=(int) (Math.random()*6+1);
			int option=(int)(Math.random()*3);
			switch(option) {
			case SNAKE:
				position-=diceroll;
				break;
			case LADDER:
				position+=diceroll;
				break;
			default:
				break;
			}
			if(position<0) {
				  position=0;
			}
			System.out.println("diceroll :"+diceroll +"dicecount :"+ dicecount+"position :"+ position);
			
			
			
		}
		System.out.println("sucessfully won!!");
		System.out.println("total dice count: "+ dicecount);

	}

}
