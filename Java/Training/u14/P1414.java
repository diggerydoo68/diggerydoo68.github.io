package com.themsinc.u14;

import java.io.PrintWriter;

public class P1414 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader (
				new FileReader ("1414in"));
		
		PrintWriter pw = new PrintWriter (
				new BufferedWriter (
				new FileWriter ("1414out")));
		
		String lineBuf;
		
		while ((lineBuf = br.readLine()) != null){
			pw.println("println power and flexibility");
			pw.write(lineBuf);
			pw.write(System.getProperty("line.seperator"));
		}
		br.close();
		pw.close();

	}

}
