package com.euler;
/*215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 21000?*/
import java.math.BigInteger;

public class Euler16{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;

		String val = BigInteger.valueOf(2).pow(1000).toString();

		for(char a : val.toCharArray()){
		    result = result + Character.getNumericValue(a);
		}
		System.out.println(result);
		 }

}
