package com.themisinc.u10;

abstract class Pet {                      //abstract class
    private String name;                  //concrete variable
    public Pet (String n) {               //constructor
        name=n;//assigning to instance variable
    }
    public String getName() {             //concrete method 
        return name;
    }
    public abstract String getFavorite(); //abstract method
}

class Cat extends Pet {                   //Cat inherits one
    private String favoritePerch;         //concrete variable
    public Cat (String n, String f) {     //and one concrete 
        super(n);                         //method, and must 
        favoritePerch = f;                //override one 
    }                                     //abstract method
    public String getFavorite() {         //with a concrete 
        return favoritePerch;             //method.
    }
}

class Dog extends Pet {                   //Dog inherits one
    private String favoritePlayArea;      //concrete variable
    public Dog (String n, String f) {     //and one concrete
        super(n);                         //method, and must
        favoritePlayArea = f;             //override one
    }                                     //abstract method
    public String getFavorite() {         //with a concrete 
        return favoritePlayArea;          //method.
    }
}

public class E103 {
    public static void main (String[] args) {
        Cat c = new Cat ("Kato", "waterheater");
        Dog d = new Dog ("Beau", "beach");

        System.out.println (
        c.getName() + " likes the " + c.getFavorite() +"\n"+
        d.getName() + " likes the " + d.getFavorite() );
    }
}
