package com.themsinc.u14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class P1419 {
	public static void main (String[] a) throws Exception {
		
		PrintWriter pw = new PrintWriter (System.out, true);
		pw.print("Enter a line: ");
		pw.flush();
		
		BufferedReader br = new BufferedReader br (
				new InputStreamReader(System.in));
		
		String s;
		if ((s=br.readLine()) == null) {
			if ((s=br.readLine()) == null){
				System.out.println("null received");
			} else {
				
				System.out.println(s);
			}
		}
		pw.println ("line=" + s + ", len=" + s.length());
	}
}
