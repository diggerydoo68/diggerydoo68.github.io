package com.themisinc.u06;
public class Customer {
    private String name;
    private double creditLimit;

    public Customer() {
        super();
    }
    public Customer(String name, double creditLimit) {
        super();
        setName (name);
        setCreditLimit (creditLimit);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getCreditLimit() {
        return creditLimit;
    }
    public void setCreditLimit(double creditLimit) {
        for (double d=50.00 ; d<=creditLimit ; d=d+10.00) {
            this.creditLimit = d;
        }
    }
}
