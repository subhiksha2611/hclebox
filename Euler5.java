package com.euler;
import java.math.*;

/*2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

*/
public class Euler5{
public static void main(String[] args) {
	       System.out.println(mul());
	   }
	   public static int mul() {
	       int i=2520;
	       boolean found=false;
	       while(!found)
	       {
	           i=i+2520;
	           boolean isDividable=true;
	           for(int j=11;j<=20;j++)
	           {
	               if(i%j!=0)
	               {
	                   isDividable=false;
	                   break;
	               }
	           }
	           if(isDividable)
	           {
	               found=true;
	           }
	       }
	       return i;
	   }
	}


