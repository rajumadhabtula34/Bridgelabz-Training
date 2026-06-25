package com.diceroll;

public class Position100 {
	public static final int NO_PLAY=0;
	public static final int LADDER=1;
	public static final int SNAKE=2;

	public static void main(String[] args) {
		int position=0;
		while(position < 100) {

		    int dieRoll = (int)(Math.random() * 6) + 1;
		    int option = (int)(Math.random() * 3);

		    switch(option) {

		        case LADDER:
		            position += dieRoll;
		            break;

		        case SNAKE:
		            position -= dieRoll;
		            break;

		        default:
		            break;
		    }

		    if(position < 0) {
		        position = 0;
		    }
		}
		System.out.println("won the game!!"+position);
		

	}

}
