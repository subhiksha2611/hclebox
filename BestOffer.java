package com.ebox;

import java.util.Scanner;

public class BestOffer{

public static void main(String[] args) {
// TODO Auto-generated method stub
int product1;
int product2;
int product3;
int totalvalue,offer1,offer2;
Scanner s=new Scanner(System.in);
System.out.println("cost of product1:");
product1=s.nextInt();
System.out.println("cost of product2:");
product2=s.nextInt();
System.out.println("cost of product3:");
product3=s.nextInt();
totalvalue=product1+product2+product3;
offer1=totalvalue*(int)0.2;
if(product1<product2&&product1<product3)
{
offer2=product1;
}
else if (product2<product3)
{
offer2=product2;
}
else
{
offer2=product3;
}
if(offer1>offer2)
{
System.out.println("Go for offer1");
}
else
{
System.out.println("Go for offer2");
}


}

}