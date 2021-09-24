package com.ebox;

public class Stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sbu=new StringBuilder("Hello");
		sbu.append("World");
		System.out.println(sbu);
		sbu.insert(5,"_java");
		System.out.println(sbu);
		sbu.replace(5,6," ");
		System.out.println(sbu);

	}

}
