package com.euler;

/*The sum of the squares of the first ten natural numbers is,
                    1^2+2^2+3^2+......_10^2=385
The square of the sum of the first ten natural numbers is,
                     (1+2+3+....+10)^2=55^2=3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025-385=2640 .

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.*/
public class Euler6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=10,sum=0,squared=0;
		for (int i = 1; i <= N; i++)
		{
		sum += i;
		squared += i * i;
		}
		int difference=sum*sum-squared;
		System.out.println(difference);
	}

}
