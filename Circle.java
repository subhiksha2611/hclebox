package com.ebox;

public class Circle extends Shape {
 private float radius;

public float getRadius() {
return radius;
}
public void setRadius(float radius) {
this.radius = radius;
}
public Circle(float radius) {
System.out.println("Enter the radius of Circle:\n"+radius);
String d=String.format("%.2f",+(3.14*radius*radius));

System.out.println("The perimeter is "+d);


    }
}

