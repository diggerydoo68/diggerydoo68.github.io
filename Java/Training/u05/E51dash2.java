package com.themisinc.u05;

public class E51dash2 {

	public static int totalOfInts = 0;
	 
    public static void main(String[] args) {
        String s1 = "123.45";
        if (isAllDigits(s1) == true) {
            System.out.println(s1 + " is all digits");
        }
 
        s1 = "246";
        if (isAllDigits(s1) == true) {
            System.out.println(s1 + " is all digits");
        }
        System.out.println("Total=" + totalOfInts);
    }
    public static boolean isAllDigits(String num) {
        int i;
        for (i=0; i < num.length(); i++) {
            char ch = num.charAt(i);
            if (Character.isDigit(ch)) { 
                continue;
            } else { 
                return false;
            }
        }
        totalOfInts += Integer.parseInt(num);
        return true;
    }

}
