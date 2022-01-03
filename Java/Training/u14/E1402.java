package com.themsinc.u14;
// class where a file object stores a file name
import java.io.File;

public class P1402 {

	public static void main(String[] args) {
		
		File f1 = new File ("f1.txt");
		File f2 = new File ("d:/myjava", "f1.txt");
		
		System.out.println("1. " + f1 + ", " + f2);
		
		File f3 = new File ("d:\\myjava\\subdir");
		File f4 = new File (f3, "data.txt");
		
		System.out.println("2. " + f3 + ", " + f4);

	}

}
