package com.ebox;
import java.util.*;
import java.io.*;
import java.lang.Object;
public class MaintoString {
	    public static void main(String[] args) {
	        //Fill your code here
	        Scanner sc=new Scanner(System.in);
	       // String s1,s2,s3;
	       // int n;
	        AddresstoString a=new AddresstoString(null,null,0);
	        CustomertoString c=new CustomertoString(null,a);
	        System.out.println("Enter the name");
	        c.name=sc.nextLine();
	        System.out.println("Enter the Address Details");
	        System.out.println("Enter the street");
	        a.street=sc.nextLine();
	        System.out.println("Enter the city");
	        a.city=sc.nextLine();
	        System.out.println("Enter the pincode");
	        a.pincode=sc.nextInt();
	        a.toString();
	        System.out.println(c);
	    }
	}