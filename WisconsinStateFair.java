package com.ebox;
import java.util.*;
public class WisconsinStateFair {
		public static void main(String[] args) 
		{
	    double a;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the total salary paid");
	    a=sc.nextDouble();
	    
	    for(int i=0;i<=a;i++)
	    {
	        int x=80*i+50*(i-10);
	        if((a-x>=0) && (a-x<130))
	        {
	            System.out.println("Number of weekday hours is "+i);
	            System.out.println("Number of weekend hours is "+(i-10));
	        }
	    }
		}
	}
