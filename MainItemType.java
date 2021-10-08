package com.ebox;
import java.io.*;
import java.util.Scanner;
public class MainItemType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//Fill your code
		        Scanner sc=new Scanner(System.in);
		    	System.out.println("Enter the item type name");
				String name=sc.nextLine();
				System.out.println("Enter the cost per day");
				double costPerDay=sc.nextDouble();
				System.out.println("Enter the deposit");
				double deposit=sc.nextDouble();
				ItemType i=new ItemType();
				i.setName(name);
				i.setCostPerDay(costPerDay);
				i.setDeposit(deposit);
				i.display();
	}

}
