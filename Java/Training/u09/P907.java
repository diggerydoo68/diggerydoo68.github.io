package com.themisinc.u09;

public class P907 {

	public static void main(String[] args) {
		int rows, cols; //2-dimension arrays are "row-major"
		                // The first dimension is rows
		                // the second dimension is columns
		
		/*1*/
		int[][] a1 = {
				{100,101,102,103}, //row 0
				{110,111,112,113}, //row 1
		};
		
		for (rows=0; rows<2; rows++){
			for (cols=0; cols<4; cols++){
				System.out.print(a1[rows][cols] + " ");
			}
			System.out.println();
		}
		
		int [][] a2 = new int[3][5];
		
		for (rows=0; rows<a2.length; rows++){
			for (cols=0; cols<a2[rows].length; cols++){
				a2[rows][cols] = 3500 + rows*10 + cols;
				System.out.print(a2[rows][cols] + " ");
			}
			System.out.println();
		}

	}

}
