package com.themsinc.u14;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.Writer;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class P1413 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader (
				new FileReader ("1413in"));
		//Reader has no readLine(), use BufferedReader
		
		Writer bw = new BufferedWriter (
				new FileWriter ("1413out",true)); //true = append
		                                          //false to overwrite
		bw.write('*');
		
		String s;
		while ((s=br.readLine()) != null)
			bw.write(s, 0, s.length()); //str,start,howMany
		
		char[]a = {'E','N','D','.','\n'};
		bw.write(a);
		
		br.close();
		bw.close();
		
		

	}

}
