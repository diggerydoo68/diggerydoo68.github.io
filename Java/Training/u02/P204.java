package com.themisinc.u02;

public class P204 {

	public static void main(String[] args) {
		int i=12, j; //Declare two local int vars
		             //Local var j holds garbage
		
		long tot = 123L; //Declare local long var tot
		                 //Cast operator L for speed
		
		tot = i + 24;    //Procedural statement
		                 //Between 2 numbers + is add
		
		System.out.println("tot=" + tot);//Between String
		                    //& nonString + is concatenate

	}

}
