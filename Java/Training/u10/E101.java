package com.themisinc.u10;

public class E101 { //class demonstrating inheritance

	public static void main(String[] args) {
		MySuper parent = new MySuper(101);
		System.out.println("1. parent=" + parent.getFirst());
		
		MySub child1 = new MySub (11, 12);
		System.out.println("2. child=" + child1.getFirst() + " and " + child1.getSecond());// child class is inheriting getfirst() from parent class
		
		MySub child2 = new MySub (22);
		System.out.println("3. child2=" + child2.getFirst() + " and " + child2.getSecond()); // child class is inheriting getfirst() from parent class

	}

}
