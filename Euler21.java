package com.euler;

public class Euler21{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,z,sumA,sumB,sumPairs;

		sumPairs = 0;

		for (i=1;i<10000;i++){
		  sumA = 0;
		  for (j=1;j<i;j++){
		    if (i%j==0)    
		      sumA += j;
		  }

		  sumB = 0;
		  for (z=1;z<sumA;z++){
		    if (sumA%z==0)
		      sumB += z;
		  }

		  if (sumB == i && sumB != sumA)
		    sumPairs += i;  
		}
System.out.println(sumPairs);
		
	}

}
