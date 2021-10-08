package com.euler;

import java.util.Scanner;

/*The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime factor of the number 600851475143 ?*/
public class Euler3{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n;
        int i;
        Scanner sc = new Scanner(System.in);
		n=sc.nextLong();
        long m=n;
        for( i=2;i<=m;i++) {
        	if(m%i==0) {
        		m/=i;
        		i--;
        	 }
        }
		System.out.println("Largest prime factor: "+i);

	}

}
