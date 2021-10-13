package com.ebox;
import java.util.*;
public class TriangleGame {
	    public static void main(String args[]){
	        int a,b,c,sum;
	        Scanner sc=new Scanner(System.in);
	        a=sc.nextInt();
	        b=sc.nextInt();
	        c=sc.nextInt();
	        sum=a+b+c;
	        if(sum==180){
	            if(a==90 || b==90 || c==90){
	                System.out.println("Prize 2");
	            }
	            else if(a==b&&b==c&&c==a){
	                System.out.println("Prize 3");
	            }
	            else{
	                System.out.println("Prize 1");
	            }
	        }
	        else{
	            System.out.println("No Prize");
	        }
	}
	}