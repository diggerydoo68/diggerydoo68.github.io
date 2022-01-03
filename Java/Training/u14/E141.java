package com.themsinc.u14;

import java.io.File;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;


public class E141 {
	
	private static final File OUTPUT_FILE_NAME = 
			new File ("numbers.txt");
	
	private static final String strNum = "123,12.34,456,12a.34,4.567,4.5bcd67,789";
	
	private static byte[] arr = new byte[strNum.length()];
	

	public static void main(String[] args) throws Exception {
		
		OutputStream outFile = new BufferedOutputStream (new FileOutputStream (OUTPUT_FILE_NAME));
		
		for (int i=0; i<strNum.length(); i++){
			arr[i] = (byte) strNum.charAt(i);
		}
		
		outFile.write(arr);
		outFile.close();
		

	}

}
