package com.euler;


/*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.*/


public class Euler1 {
	private static int SumofMultiples(int n) {
		// TODO Auto-generated method stub
		int result=0;
		for(int i=1;i<=n;i++) 
			if(i%3==0 || i%5==0)
				result++;
		return result;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("SUM OF MULTIPLES OF 3 OR 5: ");
		System.out.println(SumofMultiples(1000));

	}

	
}
