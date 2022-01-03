package com.themisinc.u03;

public class E31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		
		/*a*/
		while (i < 10){
			System.out.println(i + ", ");
			i++;
		}
		System.out.println("\n");
		
		/*b*/
		do{
		   System.out.println(i + ", ");
		   i++;
		}while (i < 20);
		System.out.println("\n");
		
		/*c*/
		for (i = 20; i < 30; i++) {
			System.out.println(i + ", ");
		}
		System.out.println("\n");

	}

}
