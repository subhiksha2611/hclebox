package com.ebox;
import java.io.*;
import java.util.*;
public class MainCustomer {
    public static void main(String[] args) throws Exception, IOException {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Customer Details");
System.out.println("Enter the name ");
String cusName=sc.nextLine();
System.out.println("Enter the email ");
String cusEmail=sc.nextLine();
System.out.println("Enter the type ");
String cusType=sc.nextLine();
System.out.println("Enter the location ");
String cusAddress=sc.nextLine();
Customer c=new Customer(cusName,cusEmail,cusType,cusAddress);
c.displayDetails();//Fill your code

}
}