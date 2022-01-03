package com.themisinc.u02;

public class P211 {

	public static void main(String[] args) {
		int a, b, c, d;
		a = b = c = d = 5;
		System.out.println("1. "+a+", "+b+", "+c+", "+d);
		
		int i = -1;
		i += 3;   //compound assignment, i=i+3, i gets 2
		System.out.println("2. i=" + i);
		
		int j= 4; // a is 5, i is 2
		a *= i + j;  //add i+j then multiply a*sum
		b *= (i+j); //same as line 13, less error prone
		c = c * (i + j); //same as line 13 but runs slower
		d = d * i + j; //multiply occurs before add
		System.out.println("3. "+a+", "+b+", "+c+", "+d);

	}

}
