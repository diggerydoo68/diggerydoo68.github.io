package com.themsinc.u14;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;

public class P1407 {

	public static void main(String[] args) throws Exception {
		
		String str = "aaaaa11111bbbbb22222ccccc33333";
		byte[] outbuf = new byte[str.length()];
		
		OutputStream out = new FileOutputStream ("1407data");
		for (int i=0; i<str.length(); i++){
			outbuf[i] = (byte) str.charAt(i);
		}
		out.write(outbuf);
		out.close();
		
		int numBytesRead = 0;
		int byteCount = 0;
		int recordCount = 0;
		byte[] inbuf = new byte[10];
		InputStream in = new FileInputStream ("1407data");
		out = new FileOutputStream("1407copy");
		
		while ((numBytesRead = in.read(inbuf)) != -1){
			//validate number of bytes read is 10
			out.write(inbuf);
			byteCount = byteCount + numBytesRead;
			recordCount++;
		}
		in.close();
		out.close();
		System.out.println(
				"records=" + recordCount + ", bytes=" + byteCount);

	}

}
