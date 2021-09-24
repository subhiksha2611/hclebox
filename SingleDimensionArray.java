package com.ebox;

public class SingleDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int empid[]= {101,102,103,104,105};
		int sum=0;
		for(int i=0;i<5;i++)
		{
			sum=sum+empid[i];
			
		}
		System.out.println("Sum of array:"+sum);
	}

}
