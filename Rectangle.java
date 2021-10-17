package com.ebox;

public class Rectangle extends Shape {
private float length,breadth;

public float getLength() {
return length;
}

public void setLength(float length) {
this.length = length;
}

public float getBreadth() {
return breadth;
}

public void setBreadth(float breadth) {
this.breadth = breadth;
}
public Rectangle(float length,float breadth) {
System.out.println("Enter the length of the Rectangle:\n"+length);
System.out.println("Enter the breadth of the Rectangle:\n"+breadth);
String d=String.format("%.2f",+(length*breadth));

System.out.println("The perimeter is "+d);

}
}