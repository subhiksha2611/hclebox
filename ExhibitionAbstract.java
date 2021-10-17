package com.ebox;

public class ExhibitionAbstract extends EventAbstract {
	private int noOfStalls;
	private double rentPerStall;
public ExhibitionAbstract(String n,String d,String t,String o,int stall,double rent) {
	super(n,d,t,o);
	this.noOfStalls=stall;
	this.rentPerStall=rent;
}
private int getNoOfStalls() {
	return noOfStalls;
}
private void setNoOfStalls(int stalls) {
	this.noOfStalls = stalls;
}
private double getRentPerStall() {
	return rentPerStall;
}
private void setRentPerStall(double rent) {
	this.rentPerStall = rent;
}
double calculateAmount() {
	double amount=noOfStalls*rentPerStall;
	return amount;
}

}
