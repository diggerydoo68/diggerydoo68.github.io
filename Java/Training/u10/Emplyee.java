package com.themisinc.u10;

public class Emplyee {
	String name;
	double salary;
	

	public Emplyee(String name, double salary) {// need to ensure that this constructor takes in the instance variables as parameters
		setName(name);
		setSalary(salary);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getWeeklySalary() {
		return salary/52;
	}

}
