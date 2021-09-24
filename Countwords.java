package com.ebox;
import java.util.*;
public class Countwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;
		int count=0;
		Scanner s=new Scanner(System.in);
		a=s.nextLine();
		for(int i=0;i<a.length()-1;i++)
		{
		if(a.charAt(i)==' ' && a.charAt(i+1)!=' ')
		count++;
		}

		System.out.println("Total number of words in string are:"+(count+1));

	}

}
