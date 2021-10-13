package com.ebox;

public class CustomerAddress {
   String name;
   Address address;

CustomerAddress (){
}

CustomerAddress(String name, Address address){
   this.name = name;
   this.address = address;
}
//Fill your code here
public String toString(){
   return name+" "+address.toString();
}
}
