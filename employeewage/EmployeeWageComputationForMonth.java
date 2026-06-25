package com.employeewage;


public class EmployeeWageComputationForMonth {
    public static final int NO_OF_DAYS=20;   
    public static final int PART_TIME=1;
    public static final int FULL_TIME=2;
    public static final int CHARGE=20;
	public static void main(String[]args) {
    	      int wages=0;
    	      int wagehours;
    	      for(int i=1;i<=NO_OF_DAYS;i++) {
    	    	  
    	    	  int time=(int)(Math.floor(Math.random()*10)%3);
    	    	  switch(time) {
    	    	  case PART_TIME:
    	    		    wagehours=4;
    	    		    break;
    	    	  case FULL_TIME:
    	    		    wagehours=8;
    	    		    break;
    	    		    
    	    	  default:
    	    		    wagehours=0;
    	    		    break;
    	    	  }
    	    	  wages=wages+wagehours*20;
    	    	     
    	      }
    	      System.out.println(wages);
       }
	
	
	
}
