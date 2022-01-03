package com.themisinc.u04;

public class E41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		whileLoop();
        doLoop();
        forLoop();
    }

    public static void whileLoop () {
        int i=0;
        while (i < 10) {
            System.out.print (i + ", ");
            i++;
        }
        System.out.println ();
    }
  
    public static void doLoop () {
        int i=10;
        do {
            System.out.print (i + ", ");
            i++;
        } while (i < 20);
        System.out.println ();
    }
  
    public static void forLoop () {
        for (int i=20; i<30 ; i++)
            System.out.print (i + ", ");
        System.out.println ("\n");
    }

	}
