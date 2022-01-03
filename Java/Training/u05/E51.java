package com.themisinc.u05;

public class E51 {

	String first="Teresa";
    String last="Hommel";
    String me; 	

/*a*/   me = String.valueOf (first);
    me = me.concat(last);
    System.out.println ("a. concat=" + me );

/*b*/   System.out.println ("b. length=" + me.length());

/*c*/   int i, count=0;
    for (i=0; i<me.length(); i++) {
        if (me.charAt(i) == 'e') {
            count ++;
        }
    }
    System.out.println ("c. count of e=" + count);

/*d*/   System.out.print ("d. ");
    for (i=me.length()-1; i>=0; i--) {
        System.out.print (me.charAt(i));
    }
    System.out.println ();

/*e*/   System.out.println ("e. upper=" + me.toUpperCase());

/*f*/   for (i=0; i<me.length(); i++) {
        char c = me.charAt(i);
        if (Character.isLowerCase(c) ) {
            System.out.print(Character.toUpperCase(c));
        }  
        //The uppercased letter was not assigned to c
        if (Character.isUpperCase(c) ) {
            System.out.print(Character.toLowerCase(c));
        }
    }
	
  }
}



