package com.themsinc.u14;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.FileReader;
import java.io.Writer;
import java.io.FileWriter;

public class P1412 {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		
		Reader fr = new FileReader ("1414in");
		Writer fr = new FileWriter ("1414in");
		
		int numRead;
		int tot=0;
		char[] buf = new char[10];
		
		while ((numRead=fr.read(buf)) != -1){
			fw.write (buf, 0, numRead);
			tot = tot + numRead;
		}
		
		System.out.println("ASCII chars copied=" + tot);
		fr.close();
		fr.close();
		

	}

}
