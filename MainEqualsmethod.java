package com.ebox;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MainEqualsmethod {
	    static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	    public static void main(String []args) throws IOException
		{
			String name = null,street = null,city = null;
			int pincode = 0,i=0,n;
			boolean result = false ;
			CustomerEquals []data = new CustomerEquals[100];
	        System.out.println("Enter number of customers");
	        n = Integer.parseInt(br.readLine());
			for(i=0;i<n;i++){
				System.out.println("Enter the Customer Details "+(i+1));
				System.out.println("Enter the name");
				name = br.readLine();
				System.out.println("Enter the Address Details");
				System.out.println("Enter the street");
				street = br.readLine();
				System.out.println("Enter the city");
				city = br.readLine();
				System.out.println("Enter the pincode");
				pincode = Integer.parseInt(br.readLine());
				data[i] = new CustomerEquals();
			}
			for(int j=0;j<n;j++){
				for(int k=0;k<n && k!=j;k++){
					result |= data[j].equals(data[k]);
					if(result){
	                    k=i+1;j=i+1;
						break;
					}
				}
			}
			if(result)
			System.out.println("\nCustomer details are identical...");
			else
			System.out.println("\nNo duplicate details...");
		}

}
