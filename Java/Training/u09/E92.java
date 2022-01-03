package com.themisinc.u09;     //two classes in one file
class MyClass {                //only one file can be public. business class. does not have public keyword. Purpose is that it holds 1 int and constructor which recieves one int as a parameter.
    private int i;   // instance variable          
    public MyClass (int i) { //
        this.i = i;
    }
    public void printMyClassInt () {
        System.out.println (i);
    }
    public void add10 () { 
        i += 10;
    }
}
public class E92 {
    public static void main (String[] args) {
    	//four different pieces for working with arrays

/*1*/   MyClass ref10 = new MyClass(10);
        MyClass ref11 = new MyClass(11);

        MyClass[] mcArray1 = new MyClass[2];
        mcArray1[0] = ref10;
        mcArray1[1] = ref11;

        for (MyClass elem : mcArray1) {  
            elem.printMyClassInt ();
        }                     
      
/*2*/   MyClass[] mcArray2 = new MyClass[2];

        for (int i=0; i<mcArray2.length; i++) {
            mcArray2[i] = mcArray1[i]; // after this point ref10 will have a reference of 3.
            mcArray2[i].add10();
            mcArray2[i].printMyClassInt ();
        }
    
/*3*/   MyClass[] mcArray3 = new MyClass[2];

        mcArray3[0] = new MyClass (30);
        mcArray3[1] = new MyClass (31);

        for (MyClass mc : mcArray3) {  
            mc.printMyClassInt ();
        }
 
/*4*/   MyClass[] mcArray4 = {
            new MyClass (40),
            new MyClass (41),
        };

        mcArray4[0].printMyClassInt (); 
        mcArray4[1].printMyClassInt ();
    }
}
