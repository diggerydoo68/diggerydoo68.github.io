package com.themisinc.u02;

public class P214 {

	public static void main(String[] args) {
	    final double FINAL_ONE = 1.5; // symbolic constant. naming is by convention. Cannot be assigned to a value more than one time
	    
	    final double FINAL_TWO; // symbolic constant. Cannot be assigned to a value more than one time
	    FINAL_TWO = 2.5;
	    
	    //FINAL_TWO = 3.5;  //cannot assign more than once
	    
	    System.out.println("1=" + FINAL_ONE + ", 2=" + FINAL_TWO);

	}

}
