package com.ebox;

public class StageEventAbstract extends EventAbstract{
	    
	    //Fill your code here
	    private int noOfShows;
	    private double costPerShow;
	    public StageEventAbstract(String n,String d,String t,String o,int no,double cost){
	        super(n,d,t,o);
	        this.noOfShows=no;
	        this.costPerShow=cost;
	    }
	    private void getNoOfShows(int no){
	        this.noOfShows=no;
	    }
	    private int getNoOfShows() {
	    	return noOfShows;
	    }
	    private void setCostPerShow(double cost) {
	    	this.costPerShow=cost;
	    }
	    
	    public double getCostPerShow() {
			return costPerShow;
		}
		
		double calculateAmount() {

	        //Fill your code here
			double amt=noOfShows*costPerShow;

	        return amt;

	    }  
		
	}
