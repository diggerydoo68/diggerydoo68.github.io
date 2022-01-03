package com.themisinc.u13;

public class P1306 {

	public static void main(String[] args) {
		try {
			sub1();
		} catch (My1306Exception m){
			m.printStackTrace();
		}

	}
	public static void sub1() throws My1306Exception {
		sub2();
	}
	public static void  sub2() throws My1306Exception{
		sub3();
	}
	public static void sub3() throws My1306Exception {
		throw new My1306Exception ();
	}

}
