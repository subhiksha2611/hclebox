package com.ebox;

public class StringAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Today is an awesome day.";
		System.out.println(s.charAt(7));
		System.out.println(s.compareTo("Today is the awesome day"));
		System.out.println(s.equalsIgnoreCase("Today"));
		System.out.println(s.length());
		System.out.println(s.indexOf('o'));
		System.out.println(s.concat("Have a great day"));
		System.out.println(s.replace('e','a'));
		System.out.println(s.substring(3,8));
		System.out.println(s.trim());
		System.out.println(s=="Have a great day");
		System.out.println(s.equals("Today is an awesome day"));

	}

}
