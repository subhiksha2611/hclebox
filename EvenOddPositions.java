package com.ebox;

public class EvenOddPositions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array=new int[]{12,45,31,78,14,5};
		System.out.println("Elements in the odd position:");
		for(int i=0;i<array.length;i=i+2)
		{
		System.out.println(array[i]);
		}
		System.out.println("Elements in the even position:");
		for(int i=1;i<array.length;i=i+2)
		{
		System.out.println(array[i]);
		}
	}

}
