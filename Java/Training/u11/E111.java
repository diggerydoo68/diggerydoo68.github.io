package com.themisinc.u11;

abstract class Pet {           //5 classes in one source file
    private String name;
    public Pet (String n) { 
        name=n; 
    }
    public String getName() { 
        return name;
    }
    public abstract String getFavorite() ; 
}
class Parrot extends Pet {
    private String favoritePerch;
    public Parrot (String n, String f) {
        super(n);
        favoritePerch = f;
    }
    public String getFavorite() {
        return favoritePerch;
    }
}
class Gerbil extends Pet {
    private String favoriteToy;
    public Gerbil (String n, String f) {
        super(n);
        favoriteToy = f;
    }
    public String getFavorite() { 
        return favoriteToy;
    }
}
class Fish extends Pet {
    private String favoriteFood;
    public Fish (String n, String f) {
        super(n);
        favoriteFood = f;
    }
    public String getFavorite() { 
        return favoriteFood; 
    }
}
public class E111 {
    public static void main (String[] args) {
        Pet[] a = {
            new Parrot ("Ziggy", "top of your shoulder"),
            new Gerbil ("Gerbert", "Running Wheel"),
            new Fish ("Finney", "dried flies")
        };
        for (int i=0; i<a.length; i++) {
            System.out.println (a[i].getName() +
            " likes the " + a[i].getFavorite() );//polymorphism is happening here. 
            //becuase it is calling an overriding method which is resolved by the JVM at runtime to call the method of the referenced object. 
            //Based on two triggers: 
            //1. a superclass defines a method common to its subclasses and they override it with their own different procedures 
            //2. a superclass reference points to a subclass object, and you call the overriding method. 
        }
    }
}
