package com.themsinc.u14;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;

public class P1406 {

	public static void main(String[] a) throws Exception {
		InputStream fis = new FileInputStream("1406in");
		OutputStream fos = new FileOutputStream("1406out");
		
		int tot=0;
		int inputHolder;
		
		while((inputHolder = fis.read()) != -1){
			fos.write (inputHolder);
			tot++;
		}
		
		fis.close();
		fos.close();
		System.out.println("Number of bytes copied=" + tot);

	}

}
