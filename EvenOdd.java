package com.ebox;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int[] arr=new int[] {13,56,42,89,60};
				for(int i=0;i<arr.length;i++)
				{
					if(arr[i]%2==0)
					{
						System.out.println("Even:"+arr[i]);
					}
					else
					{
						System.out.println("Odd:"+arr[i]);
					}
				}
			}

		}