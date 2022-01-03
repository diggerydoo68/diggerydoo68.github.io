package com.themisinc.u02;

public class P210 {

	public static void main(String[] args) {
		boolean mon = true;
		boolean tue = false;
		boolean wed = true;
		boolean thu = false;
		boolean fri = true;
		
		if (mon && tue && wed && thu && fri){
			System.out.println("1. five-day class");
		}
		
		if (mon && !tue && wed && !thu && fri){
			System.out.println("2. Mon, Wed, Fri class");
		}
		
		if (mon == true || tue == true){
			System.out.println("3. class meets Mon or Tue" + ", Monday is " + mon + ", Tuesday is " + tue);
		}

	}

}
