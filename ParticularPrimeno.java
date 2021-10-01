package com.euler;

public class ParticularPrimeno {

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
