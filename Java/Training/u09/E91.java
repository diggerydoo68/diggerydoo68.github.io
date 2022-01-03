package com.themisinc.u09;

public class E91 {

	public static void main(String[] args) {
		/*a*/   int[] a1 = { 1, 2, 4, 8, 16 };
		 
        for (int elem : a1) {
            System.out.print (elem + "  ");
        }
        System.out.println ();

     
/*b*/   int[] a2 = new int[5];
  
        for (int i=0; i<a1.length; i++) {
            a2[i] = a1[i] + 10;
        }
   
          
/*c*/   for (int elem : a2) {
            System.out.print (elem + " ");
        }
        System.out.println ();

	}

}
