package com.euler;
/*The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17. Find the sum of all the primes below two million.*/
public class SummationofPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count, sum = 0;  
		for(int number = 1; number <= 2000000; number++)  
		{  
		count = 0;  
		for (int i = 2; i <= number/2; i++){    
		   if(number % i == 0){  
		       count++;  
		       break;  
		   } 
		}
		if(count == 0 && number != 1 ){  
		      sum = sum + number;  
		}  
	    }
		System.out.println("The Sum of Prime Numbers from 1 to 2000000 is: " + sum);   
	}

}
