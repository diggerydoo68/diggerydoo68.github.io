package com.themisinc.u12;
import petsPackage.Cat; //using newly created package
import petsPackage.Dog;

public class P1205 {

	public static void main(String[] args) {
		Cat c = new Cat ("Liberty", "desk"); //different
		Dog d = new Dog ("Cisco", "hall");
		System.out.println(c + " " + d);

	}

}
