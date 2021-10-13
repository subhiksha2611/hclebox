package com.ebox;

public class Address {
   String street, city;
   int pincode;
   
   Address () {
   }
   
   Address (String street, String city, int pincode) {
       this.street = street;
       this.city = city;
       this.pincode = pincode;
   }
   
   //Fill your code here
   public String toString(){
     return street+","+city+"-"+pincode;
   }
   
}
