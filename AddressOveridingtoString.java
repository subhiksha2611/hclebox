package com.ebox;

public class AddressOveridingtoString {
	String addressLine1,addressLine2,city,state;
	int pincode;
	AddressOveridingtoString()
	{
    }
    void AddressOverdingtoString(String a1,String a2,String c,String s,int p){
    this.addressLine1=a1;
    this.addressLine2=a2;
    this.city=c;
    this.state=s;
    this.pincode=p;
}

public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
@Override
public String toString() {
	//Your code here
    return this.addressLine1+""+this.addressLine2+""+this.city+""+this.state+""+this.pincode;
}
}