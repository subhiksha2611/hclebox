package com.ebox;
import java.util.*;
public class MainOverridingtoString {
		public static void main(String[] args){
			//Your code here
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter Address Line 1");
	        String addressLine1=sc.nextLine();
	        System.out.println("Enter Address Line 2");
	        String addressLine2=sc.nextLine();
	        System.out.println("Enter the City Name");
	        String city=sc.nextLine();
	        System.out.println("Enter the State Name");
	        String state=sc.nextLine();
	        System.out.println("Enter the Pincode");
	        int pincode=sc.nextInt();
	        System.out.println("The Address Details are");
	        System.out.println(addressLine1);
	        System.out.println(addressLine2);
	        System.out.println(city);
	        System.out.println(state);
	        System.out.println(pincode);
	        
	        
		}
	}