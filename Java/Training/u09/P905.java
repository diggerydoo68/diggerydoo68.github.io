package com.themisinc.u09;

public class P905 {

	public static void main(String[] args) {
		
		String[] sa = new String[4]; //4 elem with String@000
		sa[0] = "123";
		sa[1] = "45";
		sa[2] = "6";
		sa[3] = "789";
		
		int[] ia = new int[sa.length];
		int total = 0;
		for (int i = 0; i < sa.length; i++){// remember the i++ happens last when the for loop completes the designated statement. You can also replace the increment(i=i+2 vs. i++)
			ia[i] = Integer.parseInt(sa[i]);//converting elements to integer
			total += ia[i];
		}
		System.out.println("total=" + total);

	}

}
