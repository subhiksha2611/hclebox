package com.ebox;
import java.util.*;
public class RecursionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  num=4;
		System.out.println("Factorial of "+num+" is : "+factorial(num));

	}
	public static int factorial(int num) {
		if(num==1)
			return num;
		else
			return num*factorial(num-1);
	}

}
