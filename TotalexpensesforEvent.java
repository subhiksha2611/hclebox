package com.ebox;
import java.util.*;
public class TotalexpensesforEvent {
	    public static void main(String args[])
	    {
	        double total,brp,trp,fop,lop;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter branding expenses");
	        double brand=sc.nextDouble();
	        System.out.println("Enter travel expenses");
	        double travel=sc.nextDouble();
	        System.out.println("Enter food expenses");
	        double food=sc.nextDouble();
	        System.out.println("Enter logistics expenses");
	        double logic=sc.nextDouble();
	        total=brand+travel+food+logic;
	        System.out.printf("Total expenses:Rs.%.2f",total);
	        System.out.println();
	        
	        brp=(brand/total)*100;
	        System.out.printf("Branding expenses percentage:%.2f%%",brp);
	        System.out.println();
	        
	        trp=(travel/total)*100;
	        System.out.printf("Travel expenses percentage:%.2f%%",trp);
	        System.out.println();
	        
	        fop=(food/total)*100;
	        System.out.printf("Food expenses percentage:%.2f%%",fop);
	        System.out.println();
	        
	        lop=(logic/total)*100;
	        System.out.printf("Logistics expenses percentage:%.2f%%",lop);
	        
	    }    
	        
	        
	    }