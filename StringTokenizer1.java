package com.ebox;
import java.util.StringTokenizer;
public class StringTokenizer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer strto=new StringTokenizer("This, is an example");
		while(strto.hasMoreTokens())
		{
		System.out.println(strto.nextToken(","));
	}

}
}