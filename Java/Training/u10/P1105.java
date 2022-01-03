package com.themisinc.u10;

class I2 { // remember to distinguish class names in same package
	private int i;
	public I2 (int i){
      this.i = i;
	}
	public int getI(){return i;}
}

class J extends I2 {
	private int j;
	public J (int i, int j){super(i); this.j=j;}
	public int getSum (){return getI() + j;}
}

public class P1105 {

	public static void main(String[] args) {
		int i1=0, i2=0, i4=0;
		
		I2 IrefI/*Reference*/ = new I2/*object*/ (1); //getI() is coded in obj
		i1 = IrefI.getI();   //and known to ref type I
		
		I2 IrefJ = new J (2,3);
		i2 = IrefJ.getI();    //obj & known to ref type I
		
		//i3 = IrefJ.getSum(); //unable to work because the reference is a mismatch need to cast the reference
		
		
		if (IrefJ instanceof J){
			J JrefJ = (J) IrefJ; //example of class referencing casting to use the getSum() method in class J
			
			i4 = JrefJ.getSum();
		}
		System.out.println("i1="+i1+", "+i2+", "+i4);
		}

}
