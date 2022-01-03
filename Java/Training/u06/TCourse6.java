package com.themisinc.u06;

public class Tcourse6 {
	private String name; // instance variables for each object
	private int seats; 

		public Tcourse6(String name, int seats){ //constructor method
			setName(name); // setters
			setSeats(seats); //setters
		}
		
		public String getName() {//getters
			return name;
		}
		public void setName(String newName){
			name = newName;
		}
		public int getSeats(){
			return seats;
		}
		public void setSeats(int seats){
			this.seats = seats;
		}

	}


// can you have 
// TCourse6 tc1 = new TCourse6("Java", 12);
// TCourse6 tc2 = new TCourse6("UNIX", 10);

// TCourse6 tc3 = new TCourse6("Java", 12);
