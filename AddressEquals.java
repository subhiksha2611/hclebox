package com.ebox;

public class AddressEquals{
	    String street, city;
	    int pincode;
	    
	    AddressEquals() {
	    }
	    
	    AddressEquals(String street, String city, Integer pincode) {
	        this.street = street;
	        this.city = city;
	        this.pincode = pincode;
	    }
	    
	    //Fill your code here
	   boolean equals(Address ae){
		   AddressEquals ae1=new AddressEquals();
		  ae1.equals(ae);
	       return true; 
	   }
	    private boolean Equals(String street2, String city2, int pincode2) {
		// TODO Auto-generated method stub
		return false;
	}

		public String toString(){
	      return street+","+city+"-"+pincode;
	    }
	    
	}

