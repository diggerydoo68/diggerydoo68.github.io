package com.themsinc.u14;

import java.io.InputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;

public class P1408 {

	private static final int RECORD_SIZE = 10;
	
	public static void main(String[] args) throws Exception {
		int numRead=0;
		byte[] buf = new byte [RECORD_SIZE];
		
		InputStream fis = new FileInputStream ("1408in");
		InputStream bis = new BufferedInputStream(fis);
		
		OutputStream bos = new BufferedOutputStream (
				new FileOutputStream("1408out"));
		
		while((numRead = bis.read(buf)) != -1){
			if (numRead != RECORD_SIZE){
				System.err.println ("EOF size error");
				System.exit(1);
			}
			bos.write(buf, 0, RECORD_SIZE);
		}
		bis.close();
		bos.close();

	}

}
