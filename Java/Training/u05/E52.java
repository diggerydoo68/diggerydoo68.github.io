package com.themisinc.u05;

public class E52 {

	 private static boolean allDigitsOrPoint = false;
    private static int     howManyDecimalPoints = 0;

    public static void main (String[] args) {
        String str12 = "12";
        isIntOrDouble(str12);
        if (allDigitsOrPoint && howManyDecimalPoints == 0) {
            int int12 = Integer.parseInt (str12);
            System.out.println ( 
                "1. str12=" + str12 + ", int12=" + int12 );
        }
 
        String str34 = "34.5";
        isIntOrDouble(str34);
        if (allDigitsOrPoint && howManyDecimalPoints == 1) {
            double double34 = Double.parseDouble (str34);
            System.out.println (
            "2. str34=" + str34 + ", double34=" + double34); 
        } 
    }
    public static void isIntOrDouble(String s) {
        allDigitsOrPoint = false;
        howManyDecimalPoints = 0;
        
        for (int i=0; i<s.length(); i++) {
            if (Character.isDigit( s.charAt(i) ) ) {
                continue;
            } else if (s.charAt(i) == '.') { 
                ++howManyDecimalPoints;
                continue;
            } else {
                return; //found non-digit non-decimal-point
            }
        } 
        allDigitsOrPoint = true;
    }

}
