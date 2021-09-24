package com.ebox;
import java.util.*;
public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,45,63,78,19,5};
		System.out.println("Arrays before sorting:");
		show(arr);
		sort(arr);
		System.out.println("Arrays after sorting:");
		show(arr);

	}
	public static void show(int arr[]) {
		for(int i=0;i<arr.length;i++) 
			System.out.println(arr[i]+"");
	}
	public static void sort(int arr[]) {
		int row,col,temp;
		for(row=0;row<arr.length;row++) {
			for(col=0;col<arr.length-row-1;col++) {
				if(arr[col]>arr[col+1]) {
					temp=arr[col];
					arr[col]=arr[col+1];
					arr[col+1]=temp;
				}
			}
		}
	}
	

}
