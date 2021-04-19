package com.tyss.designpattern.factory;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
		System.out.println("enter plantype");
		
		Scanner sc=new Scanner(System.in);
		
		String plan=sc.nextLine();
		
		GetPlan plan2=new GetPlan();
		
		Plan plantype2=plan2.getPlan(plan);
		
		float bill=plantype2.generateBill(10);
		System.out.println("current bill"+bill);
		sc.close();
		
		
		
		
	}

}
