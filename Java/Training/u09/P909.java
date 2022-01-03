package com.themisinc.u09;

public class P909 {

	public static void main(String[] args) {
		for (int i=0; i<args.length; i++){
			System.out.println(i + ", " + args[i]);
		}
		
		if (args.length > 0){
			int len = args[0].length();  //String length method
			System.out.println("strlen=" + len);
		}else{
			System.out.println("args length is 0");
		}

	}

}
