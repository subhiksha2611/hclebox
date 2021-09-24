package com.ebox;

public class Stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s=new StringBuffer("Good day");

		System.out.println(s);
		s.delete(4,5);
		System.out.println(s);
		s.replace(5,6,"f");
		System.out.println(s);
		s.reverse();
		System.out.println(s);
		s.append("good day");
		System.out.println(s);
		s.insert(2,"wed");
		System.out.println(s);
	}

}
