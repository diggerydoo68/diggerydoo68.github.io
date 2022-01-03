package com.themisinc.u07;

public class TC705 {
	private String name; //no initial values are coded, 
	private int seats;
	
	public TC705(String name, int seats){
		setName(name);
		setSeats(seats);
	}
	
	public TC705(String name){
		this (name, -1);  //call constructor on line 6
	}
	//public TC705(String x){ // this additional constructor will not work because it is a duplicate method
	//	this (x);  // what constructor will it call
	//}
	
	public TC705() {
		this ("none");  //call constructor on line 10 because it shares the same name "TC705"
	}
	
	public String toString(){
		return "TC705[name=" + name + ",seats=" + seats + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

}
package com.themisinc.u07;

public class TC705 {
	private String name; //no initial values are coded, 
	private int seats;
	
	public TC705(String name, int seats){
		setName(name);
		setSeats(seats);
	}
	
	public TC705(String name){
		this (name, -1);  //call constructor on line 6
	}
	//public TC705(String x){ // this additional constructor will not work because it is a duplicate method
	//	this (x);  // what constructor will it call
	//}
	
	public TC705() {
		this ("none");  //call constructor on line 10 because it shares the same name "TC705"
	}
	
	public String toString(){
		return "TC705[name=" + name + ",seats=" + seats + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

}
