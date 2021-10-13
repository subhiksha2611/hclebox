package com.ebox;
import java.util.*;
public class MagicShow {
	    public static void main(String[] args)
	    {
	        Scanner sc=new Scanner(System.in);
	        float rating1,rating2,rating3,overall;
	        System.out.println("Enter the number of people who watched show 1");
	        int show1=sc.nextInt();
	        System.out.println("Enter the average rating for show 1");
	        float show1avg=sc.nextFloat();
	        System.out.println("Enter the number of people who watched show 2");
	        int show2=sc.nextInt();
	        System.out.println("Enter the average rating for show 2");
	        float show2avg=sc.nextFloat();
	        System.out.println("Enter the number of people who watched show 3");
	        int show3=sc.nextInt();
	        System.out.println("Enter the average rating for show 3");
	        float show3avg=sc.nextFloat();
	        rating1=show1*show1avg;
	        rating2=show2*show2avg;
	        rating3=show3*show3avg;
	        overall=(rating1+rating2+rating3)/(show1+show2+show3);
	        System.out.printf("The overall average rating for the show is %.2f",overall);
	        
	    }
	}