package com.themisinc.u07;

public class P705 {

	public static void main(String[] args) {
		TC705 tc1 = new TC705 ("UNIX", 10);
		TC705 tc2 = new TC705 ("Java");
		//TC706 tc5 = new TC706 ("Java");// used to prove out theory for multiple constructors
		TC705 tc3 = new TC705 ();
		
		System.out.println(tc1 + " " + tc2 + " " + tc3);

	}

}
