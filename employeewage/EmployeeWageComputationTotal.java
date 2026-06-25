package com.employeewage;

public class EmployeeWageComputationTotal {
	    public static final int MAX_DAYS=20;   
	    public static final int PART_TIME=1;
	    public static final int FULL_TIME=2;
	    public static final int MAX_HOURS=100;
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int empmaxhours=0;
		int empmaxdays=0;
		int wage=0;
		while(empmaxdays<MAX_DAYS&&empmaxhours<MAX_HOURS) {
			
			empmaxdays++;
			int time=(int)(Math.floor(Math.random()*10)%3);
			int empworkedtime;
			switch(time) {
			case PART_TIME:
				 empworkedtime=4;
				 break;
				 
			case FULL_TIME:
				empworkedtime=8;
				break;
		    default:
		    	 empworkedtime=0;
		    	 break;
				  
		    	 
			}
			empmaxhours+=empworkedtime;
			wage=wage+empworkedtime*20;
			
			
			
			
			
		}
		System.out.println("Total Working Days : " + empmaxdays);
		System.out.println("Total Working Hours: " + empmaxhours);
		System.out.println("Total Wage         : " + wage);
		

	}

}
