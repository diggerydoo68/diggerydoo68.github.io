package com.themsinc.u15;

public class P1502 {
	private static int varI = 123;
	private static double varD = 4.5;

	public static void main(String[] args) {
		System.out.println(useStringBuffer());
		System.out.println(useStringBuilder());
		

	}
	public static String useStringBuffer () {
		StringBuffer sb = new StringBuffer("StringBuffer:");
		sb.append("varI=").append(varI);
		sb.append(", varD=").append(varD);
		return sb.toString();
	}
	
	public static String useStringBuilder (){
		return new StringBuilder("StringBuilder:")
				.append("varI=")
				.append("varI")
				.append(",varD=")
				.append("varD")
				.toString();
	}

}
