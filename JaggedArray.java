package com.ebox;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[4][]; //don't know array size
		arr[0]=new int[3];
		arr[1]=new int[4];
		arr[2]=new int[2];
		arr[3]=new int[4];
		int value=10;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=value++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
		
	}

}
