package com.themsinc.u15;

import java.util.Date;
import java.util.Random;

public class P1503 {

	public static void main(String[] args) {
		
		myDate = new Date ();
		p("1. Date=" + mayDate);
		
		myRandom = new Random();
		int num = myRandom.nextInt(7);  //0 through 7
		p("2. Random=" + myRandom + ", num=" + num);

	}
	public static void p (String s){
		System.out.println(s);
	}

}
