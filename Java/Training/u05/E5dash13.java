package com.themisinc.u05;

public class E5dash13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("A");
		String s2 = new String("B");
		System.out.println("1. " + s1 + ", " + s2);
		
		s2 = s1; // now s2 points to "A", "B" has no ref
		System.out.println("1. " + s1 + ", " + s2);
		
		s1 = null; // now s1 is not pointing, s2 points to A
		System.out.println("1. " + s1 + ", " + s2);

	}

}
