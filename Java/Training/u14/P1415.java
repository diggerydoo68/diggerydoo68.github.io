package com.themsinc.u14;

import java.util.Scanner;

public class P1415 {

	public static void main(String[] args) throws Exception {
		
		Scanner sLine = null;
		
		try {
			sLine = new Scanner (
					new BufferedReader (
					new FileReader("libraries.txt")));
			sLine.useDelimiter("\n");   //newline
			
			while (sLine.hasNext()){
				printValuePerLine (sLine.next());
			}
		}finally {
			if (sLine != null){sLine.close();}
		}

	}
	public  static void printValuePerLine (String line){
		Scanner sWord = new Scanner (line)
				.useDelimiter(",\\s*"); //comma, then maybe spaces
		
		for (int i=1; sWord.hasNext(); i++){
			System.out.print(+i+"="+sWord.next().trim()+" ");
		}
		System.out.println();
		sWord.close();
	}

}
