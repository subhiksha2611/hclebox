package com.ebox;
import java.util.*;
public class MainShape {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("List of Shapes:\r\n"
+ "1.Circle\r\n"
+ "2.Rectangle\r\n"
+ "3.Square\n");
System.out.println("Enter your choice");
int n=sc.nextInt();
switch(n) {
case 1:

Shape c=new Circle(2);
break;
case 2:
Shape r=new Rectangle(12,3);
break;
case 3:
Shape sq=new Square(3);
break;



}


}

}