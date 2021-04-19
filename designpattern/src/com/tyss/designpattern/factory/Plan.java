package com.tyss.designpattern.factory;

public abstract class Plan {
	
	double rate;
	
	public abstract void setRate();
	
	public float generateBill(float units) {
		
		setRate();
		return (float) (rate*units);
		
		
	}
	

}
