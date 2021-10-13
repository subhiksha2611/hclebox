package com.ebox;

public class AddresstoString {
	    String street, city;
	    int pincode;
	    
	    AddresstoString () {
	    }
	    
	    AddresstoString (String street, String city, Integer pincode) {
	        this.street = street;
	        this.city = city;
	        this.pincode = pincode;
	    }
	    
	    //Fill your code here
	    public String toString(){
	        System.out.println();
	      return this.street+","+this.city+"-"+this.pincode;
	    }
	    
	}

