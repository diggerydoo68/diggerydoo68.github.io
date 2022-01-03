package com.themisinc.u10;

public class OT_Emplyee extends Emplyee{
	double thisWeekHours;
	
	public OT_Emplyee( //constructor
			String name,// inherit from parent class
			double salary,// inherit from parent class
			double thisWeekHours
	){
		super(name, salary); //calling the parent constructor
		this.thisWeekHours = thisWeekHours;
	}
	
	public double getWeeklySalary(){
		double overtimeRate = super.getWeeklySalary() / 40;
		double overtimeHours = thisWeekHours - 40;
		double overtimePay = overtimeRate * overtimeHours;
		return super.getWeeklySalary() + overtimePay;
	}
	
}
