package com.tyss.designpattern.factory;

public class GetPlan {
	
	public Plan getPlan(String planType) {
		if(planType.equalsIgnoreCase("Domestic")) {
			return new Domestic();
			
		}else if(planType.equalsIgnoreCase("Commercial")) {
			
			return new Commercial();
			
		}
        else if(planType.equalsIgnoreCase("Institution")){
        	return new Institution();
			
		}
		return null;
	}
	

}
