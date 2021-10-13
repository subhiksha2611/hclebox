package com.ebox;
import java.util.Scanner;
public class PrintYear {
		    public static void main(String args[]){
		        int year;
		        Scanner sc= new Scanner(System.in);
		        System.out.println("Enter current year:");
		        year=sc.nextInt();
		        System.out.println("Java was created in the year 1991. I am reading Java in the year "+year);
		    }
}