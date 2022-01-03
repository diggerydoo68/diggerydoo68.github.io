package com.themsinc.u14;

import java.io.*;

public class P1409 {
	
	private static byte[] buf = new byte[8];

	public static void main(String[] args) throws Exception{
		int numRead = 0;
		int len = 8;
		BufferedInputStream bis = new BufferedInputStream (
				new FileInputStream("1411in"));
		
		while((numRead = bis.read (buf, 8-len, len)) != -1){
			for (int i=0; i<8; i++)
				System.out.print(buf[i]+"="+(char)buf[i]+" ");
			System.out.println();
			
		switch ((char)buf[0]){
			case '4' : printRec(4); len=4; break;
			case '6' : printRec(6); len=6; break;
			case '8' : printRec(8); len=8; break;
			}
			System.arraycopy(buf, len, buf, 0, 8-len);
		}
		bis.close();

	}
	public static void printRec(){
		String s = new String (buf, 0, len);
		System.out.println(s);
	}

}
