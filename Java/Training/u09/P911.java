package com.themisinc.u09;

public class P911 {

	public static void main(String[] args) {
		/*1*/
		int[] a1 = {10, 11, 12, 13, 14, 15};
		
		for(int i=0; i<3; i++){
			a1[i+1] = a1[i];
		}
		for (int elem : a1){
			System.out.print(elem + ", ");
		}
		System.out.println();
		
		/*2*/
		int[] a2 = {20, 21, 22, 23, 24, 25};
		
		System.arraycopy(a2, 0, a2, 1, 3);
		
		for (int elem : a2){
			System.out.print(elem + ", ");
		}
		System.out.println();

	}

}
