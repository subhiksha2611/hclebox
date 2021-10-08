package com.euler;
/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?

*/
public class Euler7 {

	public static boolean isPrime(int n){
		   if(n%2==0) return false;
		   else {
		     for(int i=3; i<= (int)Math.sqrt(n); i+=2){
		       if(n%i==0) return false;
		     }
		   }
		   return true;
		 }
		 
		 public static void main (String[] args)
		 {
		    int count = 1;
		    for (int i=3; ;i++){
		      if(isPrime(i)) count++;
		            
		      if(count == 10001) {
		        System.out.println(i);
		        break;
		      }
		    }

	}

}
