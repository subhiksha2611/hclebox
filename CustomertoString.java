package com.ebox;

public class CustomertoString {
	    String name;
	    AddresstoString address;

	CustomertoString (){
	}

	CustomertoString(String name, AddresstoString a){
	    this.name = name;
	    this.address = a;
	}
	//Fill your code here
	public String toString(){
	    return this.name+" "+this.address.toString();
	}
	}