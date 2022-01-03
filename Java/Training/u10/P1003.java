package com.themisinc.u10;

public class P1003 {
	class I extends Object{ //superclass
		private int i;
		public I (int i){
			this.i = i;//compiler places 'super()' when a constructor calls to the superclaSS constructor
		}
		
	}
	class J extends I{
		private int j;
		public J (int i, int j){
			super(i);
			this.j=j;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        K refK = new K (100, 200, 300;)
	}

}

//EXTENDS --> child class has extend keyword
// class j extends i
