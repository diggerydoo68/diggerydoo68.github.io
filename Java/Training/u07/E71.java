package com.themisinc.u07;
public class E71 {
    public static void main (String[] args) {

        MyString7 my1 = new MyString7 ("first");
        MyString7 my2 = new MyString7 ();

        System.out.println ("before: " +
            my1.getStr() + ", " + my2.getStr() );

        my1.setStr ("new first");
        my2.setStr ("new second");

        System.out.println ("after:  " +
            my1.getStr() + ", " + my2.getStr() );
    } 
}
