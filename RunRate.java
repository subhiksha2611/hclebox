package com.ebox;
import java.util.Scanner;
public class RunRate {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc= new Scanner(System.in);
		        System.out.println("Enter total number of overs : ");
		        int a=sc.nextInt();
		        System.out.println("Enter Target Runs : ");
		        int b=sc.nextInt();
		        System.out.println("Enter overs bowled : ");
		        double c=sc.nextDouble();
		        System.out.println("Enter Runs scored : ");
		        int d=sc.nextInt();
		        double Runrate = d/c;
		        System.out.printf("Current Run Rate: %.2f",Runrate);
		        System.out.println();
		        double run=-((Runrate*c)-b)/(a-c);
		        int val=(int)c;
		        System.out.printf("Run Rate required after "+val+" overs :%.2f",run);
	}

}
