package com.ebox;
public class Customer{
//Fill your code
public String customerName;
   public String customerEmail;
public String customerType;
public String customerAddress;
Customer(String customerName,String customerEmail,String customerType,String customerAddress) {
this.customerName=customerName;
this.customerEmail=customerEmail;
this.customerType=customerType;
this.customerAddress=customerAddress;
}
public void displayDetails(){

//Fill your code
       System.out.println("Name: "+customerName);
    System.out.println("E-mail: "+customerEmail);
System.out.println("Type: "+customerType);
System.out.println("Location: "+customerAddress);

}

}