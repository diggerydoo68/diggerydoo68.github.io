package com.themisinc.u06;

import com.themisinc.u08.TCourse6;

public class E61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyString my1 = new MyString("first"); //object creation. With my1 as the reference
		MyString my2 = new MyString("second");
		
		System.out.println("before: " + my1.getStr() + ", " + my2.getStr());//using the getters
		
		my1.setStr("new first"); //setter
		my2.setStr("new second"); //setters
		
		System.out.println("after: " + my1.getStr() + ", " + my2.getStr());//using the getters

	}

}



/*
 * // these are all the same in terms of definition of variable
int roomCount = 1; // Declaration statement

roomCount = roomCount + 1; //procedural statment

TCourse6 tc1; // declaration statement

tc1 = new TCourse6("X", 2); //procedural statement
 * */
