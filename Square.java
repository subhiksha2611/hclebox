package com.ebox;

public class Square extends Shape {
private float side;

public float getSide() {
return side;
}

public void setSide(float side) {
this.side = side;
}
public Square(float side) {
System.out.println("Enter the side of the Square:\n"+side);
String d=String.format("%.2f",+(side*side));
System.out.println("The perimeter is "+d);
}
}
