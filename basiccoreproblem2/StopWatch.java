package com.basiccoreproblem2;

import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("press the enter to start");
        sc.nextLine();
        long startTime=System.currentTimeMillis();
        System.out.print("press the enter to stop");
        sc.nextLine();
        long endTime=System.currentTimeMillis();
        long elapsedTime=endTime-startTime;
        System.out.print("ElapsedTime is "+ elapsedTime);
	}

}
