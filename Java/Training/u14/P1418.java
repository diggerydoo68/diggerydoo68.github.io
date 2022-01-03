package com.themsinc.u14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1418 {

	public static void main(String[] args) throws IOException {
		
		System.out.print("Enter a line: ");
		System.out.flush();
		
		BufferedReader br = new BufferedReader (
				new InputStreamReader(System.in));
		
		String s;
		if ((s = br.readLine()) == null){
			System.exit(1);
		}
		int len = s.length();
		System.out.println("line=" + s + ", len=" + len);
		

	}

}
