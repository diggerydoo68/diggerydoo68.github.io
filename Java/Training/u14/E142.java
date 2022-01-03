package com.themsinc.u14;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

import com.themisinc.u13.BadDataException; //import from a different package
public class E142 {
    
    private static PrintWriter errorLog = null;
    
    public static void main (String[] args) 
    throws Exception {
        errorLog = new PrintWriter ("ErrorLog.txt");
        Scanner scan = null;
        try {
            scan = new Scanner(new BufferedReader(
                new FileReader("numbers.txt")))
                .useDelimiter(",");
            while (scan.hasNext()) {
                validateNextToken(scan.next());
            }
        } finally {
            if (scan != null) {
                scan.close();
            }
            errorLog.close();
        }
    }
    public static void validateNextToken (String s) {
        boolean errorFound = false;
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            try {
                if (Character.isDigit( c ) ) {
                    continue;
                } else {
                    throw new BadDataException();
                } 
            } catch (BadDataException bde) {
                errorLog.println ("non-digit "+c+" in "+s);
                errorLog.flush();
                errorFound = true;
            }
        }      
        if (errorFound == false) {
            System.out.println ("all digits: " + s);
        }
    }     
}
