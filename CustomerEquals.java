package com.ebox;

public class CustomerEquals {
    String name;
    Address address;

CustomerEquals(){
}

CustomerEquals(String name, Address address){
    this.name = name;
    this.address = address;
}
//Fill your code here
boolean equals(CustomerEquals ce){
	CustomerEquals ce1=new CustomerEquals();
	ce1.equals(ae);
    return true;
}
public String toString(){
    return  "Name:"+name+"\nAddress:"+address.street+","+address.city+"-"+address.pincode;
}
}