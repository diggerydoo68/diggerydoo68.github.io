package com.themisinc.u09;

public class P903 {

	public static void main(String[] args) {
		 int i = 5;   //primitive variable, int variable
		 
		 int[] a1;    //reference only, int array
		 a1 = new int[10];   //a1 references array. procedural statement pointing to a new array
		 
		 int[] a2 = new int[16];  //reference and array
		 
		 char[] a3 = {'a', 'b', 'c'};
		 double a4[] = {0.0, 1.1, 2.2, 3.3};   //older syntax
		 
		 System.out.println("i=" + i + ", a1=" + a1 + ", a2=" + a2 + ", a3=" + a3 + ", a4=" + a4);
		 
		 for (i=0; i<a3.length; i++){     //length of array
			 System.out.println(a3[i]);   //element notation
		 }
		 
		 a2 = a1;      //16-int array is garbage-collected
		               //referenc count of 10-int array is 2
		 
		 System.out.println("a1="+a1 + ", a2=" + a2);
		 
		 a2 = null;    //reference count of 10-int array is 1

	}

}
