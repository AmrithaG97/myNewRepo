package com.ust.beans;

public class Main {
	
	public static void main(String[] args)
	{
		SalesData objSalesData = new SalesData();
		
		System.out.println("Welcomne to sales App");
		
		displayGreeting();
		
		objSalesData.display();
	}
	
	private static void displayGreeting()
	{
		System.out.println("Sales report 2019");
	}
	
	
}
