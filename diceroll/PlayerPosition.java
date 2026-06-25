package com.diceroll;

public class PlayerPosition {
	
	public static final int NO_PLAY=0;
	public static final int LADDER=1;
	public static final int SNAKE=2;
	public static void main(String[]args) {
	int position = 0;

	int dieRoll = (int)(Math.random() * 6) + 1;
	int option = (int)(Math.random() * 3);

	switch(option) {

	    case LADDER:
	        position += dieRoll;
	        System.out.println("Ladder");
	        break;

	    case SNAKE:
	        position -= dieRoll;
	        System.out.println("Snake");
	        break;

	    default:
	        System.out.println("No Play");
	}
	if(position>0) {
	System.out.print(position);
	}
	else {
		System.out.print(0);
	}
	}
}
