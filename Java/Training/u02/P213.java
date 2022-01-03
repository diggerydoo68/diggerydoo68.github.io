package com.themisinc.u02;

public class P213 {

	public static void main(String[] args) {
		
		double d = 123.45;
		
		//int i = d;      //will not compile
		int i = (int)d;
		System.out.println("1. d="+ d + ", i=" + i);
		
		byte b = 127; //max value that fits in a byte var
		String bBefore = Integer.toBinaryString(b);
		System.out.println("2. b="+ b + ", " + bBefore);
		
		b = (byte) d;  //drops fraction and messes up integer
		String bAfter = Integer.toBinaryString(b);
		System.out.println("3. b="+ b + ", " + bAfter);

	}

}
