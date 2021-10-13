package com.ebox;
import java.util.*;
import java.io.*;
public class MainAddress {
   public static void main(String[] args) {
       //Fill your code here
       Scanner sc=new Scanner(System.in);
       String s1,s2,s3;
       int n;
       System.out.println("Enter the name");
       s1=sc.nextLine();
       System.out.println("Enter the Address Details");
       System.out.println("Enter the street");
       s2=sc.nextLine();
       System.out.println("Enter the city");
       s3=sc.nextLine();
       System.out.println("Enter the pincode");
       n=sc.nextInt();
        CustomerAddress c=new CustomerAddress();
        String b=c.toString();
        System.out.println(b);
   }
}
