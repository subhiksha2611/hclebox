package com.ebox;
import java.text.*;
public class ItemType {
		//Fill your code
	       private String name;
	    	private double costPerDay;
	       private	double deposit;
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public double getCostPerDay() {
				return costPerDay;
			}
			public void setCostPerDay(double costPerDay) {
				this.costPerDay = costPerDay;
			}
			public double getDeposit() {
				return deposit;
			}
			public void setDeposit(double deposit) {
				this.deposit = deposit;
			}
		
		public void display(){

			//Fill your code
	        System.out.println("Item type details");
	        System.out.println("Name : "+getName());
	        System.out.print("CostPerDay : ");
	System.out.printf("%.2f",+getCostPerDay());
	        System.out.print("\nDeposit : ");
	        System.out.printf("%.2f",+getDeposit());
	    		
		
		}
	}

}
