package com.ebox;

public class Userdefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number=10,result=0;
		Userdefined abc=new Userdefined();
		result=abc.findCube(number);//function call
		System.out.println(findCube(number));
		System.out.println("Cube of a number "+ "is : " +result);
		 }
		public static double findCube(double number)
		{
		double cubevalue=number*number*number;
		return cubevalue;
		}

	}


