package com.themisinc.u02;

public class P205 {

	public static void main(String[] args) {
		int i = 1 + 2 * 3 - 4 / 5;
		
		int q = 10/3;
		int r = 10%3;
		System.out.println("i="+i + ", q=" +q + "r="+r);
		
		int j =0;
		++j;     //j = j +1;
		int k = 0;  
		k++;     //k=k+1
		System.out.println("++j="+j+", k++="+k);
		
		k=4;
		i=3 * ++k;    //k=k+1; i=3*k;
		System.out.print("before: i=" + i + " k=" + k);
		k = 4;
		i = 3 * k++;
		System.out.println(", after: i=" + i + " k=" + k);

	}

}
